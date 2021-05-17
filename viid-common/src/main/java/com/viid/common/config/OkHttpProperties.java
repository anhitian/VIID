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

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import java.io.File;
import java.time.Duration;

/**
 * RestemplateProperties
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/21
 * @since 0.1.0
 **/

@Data
@ConfigurationProperties(prefix = "okhttp")
public class OkHttpProperties {


    /**
     * 连接超时 单位毫秒
     */
    private Duration connectTimeout =  Duration.ofMillis(30000L);
    /**
     * 读取超时 单位毫秒
     */
    private Duration readTimeout = Duration.ofMillis(30000L);
    /**
     * 写超时 单位毫秒
     */
    private Duration writeTimeout = Duration.ofMillis(30000L);


    private Duration pingInterval = Duration.ZERO;

    private boolean retryOnConnectionFailure = true;

    private boolean followSslRedirects = true;

    // @NestedConfigurationProperty
    // 当CacheProperties不作为内部类时，我们使用 NestedConfigurationProperty，这里我们用不到
    private CacheProperties cache = new CacheProperties();

    @Data
    public static class CacheProperties {

        private boolean enabled;

        private DataSize maxSize = DataSize.ofMegabytes(10);

        private File directory;
    }

    private ConnectionPoolProperties connectionPool=new ConnectionPoolProperties();


    @Data
    public static class ConnectionPoolProperties {
        /**
         * 连接池 最大闲置连接数
         */
        private int maxIdleConnections = 5;

        /**
         * 连接池 最大保活周期 单位毫秒
         */
        private Duration keepAliveDuration = Duration.ofMillis( 5 * 60 * 1000L);
    }
}
