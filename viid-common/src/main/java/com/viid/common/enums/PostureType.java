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
 * PostureType
 * 姿态
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 19:35
 * @since 0.1.0
 */

@Getter
public enum PostureType {

    /**
     * 1	1	站
     * 2	2	蹲
     * 3	3	卧
     * 4	4	躺
     * 5	5	坐
     * 6	6	行走
     * 7	7	奔跑
     * 8	8	跳跃
     * 9	9	攀登
     * 10	10	匍匐
     * 11	99	其他
     */

    STAND("1", "站"),
    SQUAT("2", "蹲"),
    LYING("3", "卧"),
    LIE_DOWN("4", "躺"),
    SIT("5", "坐"),
    WALK("6", "行走"),
    RUN("7", "奔跑"),
    JUMP("8", "跳跃"),
    CLIMB("9", "攀登"),
    CREEPING("10", "匍匐"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    PostureType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
