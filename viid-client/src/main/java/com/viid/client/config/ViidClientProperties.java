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

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ViidClientProperties
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/19
 * @since 0.1.0
 **/
@Data
@ConfigurationProperties(prefix = "viid-client")
public class ViidClientProperties {


    /**
     * 是否开启鉴权
     */
    private Boolean authEnable=true;

    /**
     * 鉴权用户名
     */
    private String username="admin";

    /**
     * 鉴权密码
     */
    private String password="admin";

    /**
     * 是否保活
     */
    private Boolean keepaliveEnable=true;
}
