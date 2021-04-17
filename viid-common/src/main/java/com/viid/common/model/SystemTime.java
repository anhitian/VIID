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
import com.fasterxml.jackson.annotation.JsonRootName;
import com.viid.common.enums.TimeCorrectModeType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * SystemTime
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/10
 * @since 0.1.0
 **/

@Data
@Builder
@JsonRootName("SystemTimeObject")
public class SystemTime {
    /**
     * 服务器标示符
     * 20位数字
     * 视图库的唯一标识符，相同视图库在不同环境中，标识符值仍然一致
     *
     * @required
     * @mock 31000051511191250218
     * @since 0.1.0
     */
    @JsonProperty("VIIDServerID")
    private String viidServerId;


    /**
     * 校时模式
     *
     * @required
     * @mock 1
     * @since 0.1.0
     */
    @JsonProperty("TimeMode")
    private TimeCorrectModeType timeMode;

    /**
     * 日期时间
     *
     * @required
     * @mock 20190319103155
     * @since 0.1.0
     */
    @JsonProperty("LocalTime")
    private LocalDateTime localTime;


    /**
     * 时区
     *
     * @required
     * @mock Asia/Shanghai
     * @since 0.1.0
     */
    @JsonProperty("TimeZone")
    private String timeZone;
}
