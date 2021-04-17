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
 * DispositionRangeType
 * 布控范围
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum DispositionRangeType {


    /**
     * 序号	消息中取值	说明
     * 1	1	县内（含县级市）
     * 2	2	跨县
     * 3	3	市内
     * 4	4	跨市
     * 5	5	省内
     * 6	6	跨省
     * 7	7	全国
     * 8	8	跨境
     * 9	9	卡口
     */

    PREFECTURE("1", "县内（含县级市）"),
    CROSS_COUNTY("2", "跨县"),
    CITY("3", "市内"),
    INTERCITY("4", "跨市"),
    PROVINCE("5", "省内"),
    INTERPROVINCIAL("6", "跨省"),
    NATIONWIDE("7", "全国"),
    CROSS_BORDER("8", "跨境"),
    BAYONET("9", "卡口");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    DispositionRangeType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
