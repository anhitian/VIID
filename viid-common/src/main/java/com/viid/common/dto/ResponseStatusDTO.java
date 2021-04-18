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

import java.time.LocalDateTime;

/**
 * ResponseStatus
 * 返回状态
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/9
 * @since 0.1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("ResponseStatusObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseStatusDTO {

    /**
     * id编号
     *
     * @mock 31000051511191250218
     * @since 0.1.0
     */
    @JsonProperty(value = "Id")
    private String id;

    /**
     * 请求
     *
     * @required
     * @mock /VIID/System/Register
     * @since 0.1.0
     */
    @JsonProperty(value = "RequestURL")
    private String requestUrl;

    /**
     * 当地时间
     *
     * @mock 20190312155033
     * @since 0.1.0
     */
    @JsonProperty(value = "LocalTime")
    private LocalDateTime localTime;

    /**
     * 状态码
     *
     * @required
     * @mock 0
     * @since 0.1.0
     */
    @JsonProperty(value = "StatusCode")
    private Integer statusCode;

    /**
     * 状态信息
     *
     * @mock ok
     * @since 0.1.0
     */
    @JsonProperty(value = "StatusString")
    private String statusString;


    public static ResponseStatusDTO ok(String id, String requestUrl) {
        return  ResponseStatusDTO.builder().id(id).requestUrl(requestUrl)
                .statusCode(0)
                .statusString("")
                .localTime(LocalDateTime.now())
                .build();
    }

}