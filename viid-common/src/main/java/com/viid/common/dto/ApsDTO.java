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

package com.viid.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Aps
 * 采集系统对象
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/10
 * @since 0.1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("APSObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApsDTO {
    /**
     * 设备ID
     *
     * @required
     * @mock 31000051511191250218
     * @since 0.1.0
     */
    @JsonProperty(value = "ApsID")
    private String apsId;

    /**
     * IP地址
     *
     * @required
     * @mock 127.0.0.1
     * @since 0.1.0
     */
    @JsonProperty(value = "IPAddr")
    private String ipAddr;

    /**
     * IPv6地址
     *
     * @mock 127.0.0.1
     * @since 0.1.0
     */
    @JsonProperty(value = "IPV6Addr")
    private String ipV6Addr;


    /**
     * 是否在线
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsOnline")
    private String isOnline;

    /**
     * 名称
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * 端口号
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Port")
    private Integer port;
}
