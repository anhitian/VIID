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
 * FrontThingType
 * 车前部物品类型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum FrontThingType {


    /**
     * 序号	消息中取值	说明
     * 1	1	检测标志
     * 2	2	香水
     * 3	3	挂饰
     * 4	4	遮阳板
     * 5	5	夜间遮阳板
     * 6	99	其他
     */

    DETECTION_MARK("1", "检测标志"),
    PERFUME("2", "香水"),
    ORNAMENTS("3", "挂饰"),
    SUN_VISOR("4", "遮阳板"),
    NIGHT_SUN_VISOR("5", "夜间遮阳板"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    FrontThingType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
