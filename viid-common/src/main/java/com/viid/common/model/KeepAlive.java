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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * KeepAlive
 * 保活对象
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/9
 * @since 0.1.0
 **/
@Data
@JsonRootName("KeepaliveObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeepAlive {

    /**
     * 设备或系统ID
     *
     * @required
     * @mock 31000051511191250218
     * @since 0.1.0
     */
    @JsonProperty(value = "DeviceID")
    @NotEmpty
    @Length(max = 20, min = 20)
    private String deviceID;
}
