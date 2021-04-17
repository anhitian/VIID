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
 * HairStyleType
 * 发型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 19:35
 * @since 0.1.0
 */
@Getter
public enum HairStyleType {

    /**
     * 序号	消息中取值	说明
     * 1	1	平头
     * 2	2	中分
     * 3	3	偏分
     * 4	4	额秃
     * 5	5	项秃
     * 6	6	全秃
     * 7	7	卷发
     * 8	8	波浪发
     * 9	9	麻花辫
     * 10	10	盘发
     * 11	11	披肩
     * 12	99	其他
     */

    CREW_CUT("1", "平头"),
    CENTRE_PARTING("2", "中分"),
    SIDEBURNS("3", "偏分"),
    BALD_FOREHEAD("4", "额秃"),
    NAPE_BALD("5", "项秃"),
    TOTALLY_BALD("6", "全秃"),
    CURLS("7", "卷发"),
    WAVY_HAIR("8", "波浪发"),
    TWIST_BRAID("9", "麻花辫"),
    UPDO("10", "盘发"),
    SHAWL("11", "披肩"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    HairStyleType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
