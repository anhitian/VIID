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
 * CoatLengthType
 * 上衣长度
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:13
 * @since 0.1.0
 */

@Getter
public enum CoatLengthType {
    /**
     * 序号	消息中取值	说明
     * 1	1	长袖
     * 2	2	短袖
     * 3	3	无袖
     */
    LONG_SLEEVE("1", "长袖"),
    SHORT_SLEEVE("2", "短袖"),
    SLEEVELESS("3", "无袖");
    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    CoatLengthType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
