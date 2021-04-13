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

package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * HDirectionType
 * 水平方向
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum HDirectionType {


    /**
     * 序号	消息中取值	说明
     * 1	1	西向东（简称东，下同）
     * 2	2	东向西（西）
     * 3	3	北向南（南）
     * 4	4	南向北（北）
     * 5	5	西南到东北（东北）
     * 6	6	东北到西南（西南）
     * 7	7	西北到东南（东南）
     * 8	8	东南到西北（西北）
     * 9	9	其他
     */
    WEST_TO_EAST("1", "西向东（东）"),
    EAST_TO_WEST("2", "东向西（西）"),
    NORTH_TO_SOUTH("3", "北向南（南）"),
    SOUTH_TO_NORTH("4", "南向北（北）"),
    SOUTHWEST_TO_NORTHEAST("5", "西南到东北（东北）"),
    NORTHEAST_TO_SOUTHWEST("6", "东北到西南（西南）"),
    NORTHWEST_TO_SOUTHEAST("7", "西北到东南（东南）"),
    SOUTHEAST_TO_NORTHWEST("8", "东南到西北（西北）"),
    OTHER("9", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    HDirectionType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
