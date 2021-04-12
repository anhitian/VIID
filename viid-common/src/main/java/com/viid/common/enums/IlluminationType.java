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
 * IlluminationType
 * 现场光线
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum IlluminationType {
    /**
     * 序号	消息中取值	说明
     * 1	1	自然光
     * 2	2	灯光
     * 3	3	火光
     */
    NATURAL_LIGHT("1","自然光"),
    LIGHT("2","灯光"),
    FIRELIGHT("3","火光");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    IlluminationType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
