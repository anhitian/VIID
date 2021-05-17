/*
 * Copyright (c) 2020 qian.he Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viid.common.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.condition.NoneNestedConditions;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.client.RestTemplateRequestCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * OkHttpRestTemplateAutoConfiguration
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/21
 * @since 0.1.0
 **/
@Slf4j
@ConditionalOnClass({RestTemplateCustomizer.class, RestTemplate.class})
@AutoConfigureBefore(RestTemplateAutoConfiguration.class)
@AutoConfigureAfter(HttpMessageConvertersAutoConfiguration.class)
@Conditional(OkHttpRestTemplateAutoConfiguration.NotReactiveWebApplicationCondition.class)
@EnableConfigurationProperties({OkHttpProperties.class})
public class OkHttpRestTemplateAutoConfiguration {


    @Bean
    @Lazy
    @ConditionalOnMissingBean
    public RestTemplateBuilder restTemplateBuilder(ObjectProvider<HttpMessageConverters> messageConverters,
                                                   ObjectProvider<RestTemplateCustomizer> restTemplateCustomizers,
                                                   ObjectProvider<RestTemplateRequestCustomizer<?>> restTemplateRequestCustomizers,
                                                   OkHttpClient okHttpClient) {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        HttpMessageConverters converters = messageConverters.getIfUnique();
        if (converters != null) {
            builder = builder.messageConverters(converters.getConverters());
        }
        builder = addCustomizers(builder, restTemplateCustomizers, RestTemplateBuilder::customizers);
        builder = addCustomizers(builder, restTemplateRequestCustomizers, RestTemplateBuilder::requestCustomizers);

        builder = builder.requestFactory(() -> new OkHttp3ClientHttpRequestFactory(okHttpClient));

        return builder;
    }

    private <T> RestTemplateBuilder addCustomizers(RestTemplateBuilder builder, ObjectProvider<T> objectProvider,
                                                   BiFunction<RestTemplateBuilder, Collection<T>, RestTemplateBuilder> method) {
        List<T> customizers = objectProvider.orderedStream().collect(Collectors.toList());
        if (!customizers.isEmpty()) {
            return method.apply(builder, customizers);
        }
        return builder;
    }

    static class NotReactiveWebApplicationCondition extends NoneNestedConditions {

        NotReactiveWebApplicationCondition() {
            super(ConfigurationPhase.PARSE_CONFIGURATION);
        }

        @ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
        private static class ReactiveWebApplication {

        }
    }

}
