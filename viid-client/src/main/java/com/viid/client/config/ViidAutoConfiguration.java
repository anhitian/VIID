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

package com.viid.client.config;

import com.viid.client.ViidClient;
import com.viid.common.config.OkHttpRestTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-09 00:00
 * @since 0.1.0
 **/

@Configuration
@AutoConfigureAfter(OkHttpRestTemplateAutoConfiguration.class)
@ConditionalOnClass(value = {ViidClient.class})
@EnableConfigurationProperties(value = {ViidClientProperties.class})
public class ViidAutoConfiguration {



    @Bean
    @ConditionalOnMissingBean(value = {ViidClient.class})
    public ViidClient viidClient(ViidClientProperties viidClientProperties,
                                 List<ViidClientConfigurationCustomizer> viidClientConfigurationCustomizers){
        if (viidClientConfigurationCustomizers != null) {
            for (ViidClientConfigurationCustomizer customizer : viidClientConfigurationCustomizers) {
                customizer.customize(viidClientProperties);
            }
        }
        return new ViidClient(viidClientProperties);
    }
}
