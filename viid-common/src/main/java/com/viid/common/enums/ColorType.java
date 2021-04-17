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
 * ColorType
 * 颜色
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 15:29
 * @since 0.1.0
 */
@Getter
public enum ColorType {

    /**
     * 序号	消息中取值	说明
     * 1	1	黑
     * 2	2	白
     * 3	3	灰
     * 4	4	红
     * 5	5	蓝
     * 6	6	黄
     * 7	7	橙
     * 8	8	棕
     * 9	9	绿
     * 10	10	紫
     * 11	11	青
     * 12	12	粉
     * 13	13	透明
     * 14	99	其他
     */
    BLACK("1", "黑"),
    WHITE("2", "白"),
    GRAY("3", "灰"),
    RED("4", "红"),
    BLUE("5", "蓝"),
    YELLOW("6", "黄"),
    ORANGE("7", "橙"),
    BROWN("8", "棕"),
    GREEN("9", "绿"),
    PURPLE("10", "紫"),
    CYAN("11", "青"),
    PINK("12", "粉"),
    TRANSPARENT("13", "透明"),
    OTHER("99", "其他");
    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    ColorType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
