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

package com.viid.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * ResponseStatus
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/9
 * @since 0.1.0
 **/
@Data
public class ResponseStatus {

    /**
     * id编号
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Id")
    private String id;

    /**
     * 请求
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "RequestURL")
    private String requestURL;

    /**
     * 当地时间
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "LocalTime")
    private LocalDateTime localTime;

    /**
     * 状态码
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Register")
    private Integer statusCode;

    /**
     * 状态信息
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "StatusString")
    private String statusString;
}
