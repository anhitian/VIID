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
 * RearThingType
 * 车后部物品类型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum RearThingType {


    /**
     * 序号	消息中取值	说明
     * 1	1	枕头
     * 2	2	雨伞
     * 3	3	纸巾
     * 4	4	车贴
     * 5	5	标识
     * 6	6	涂鸦
     * 7	99	其他
     */
    PILLOW("1", "枕头"),
    UMBRELLA("2", "雨伞"),
    PAPER_TOWEL("3", "纸巾"),
    CAR_STICKER("4", "车贴"),
    LOGO("5", "标识"),
    GRAFFITI("6", "涂鸦"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    RearThingType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
