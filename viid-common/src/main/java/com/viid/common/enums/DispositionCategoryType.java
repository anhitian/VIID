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
 * DispositionCategoryType
 * 布控类别
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum DispositionCategoryType {

    /**
     * 序号	消息中取值	说明
     * 1	1	人员
     * 2	2	人脸
     * 3	3	机动车
     * 4	4	非机动车
     * 5	5	关键字
     */
    PERSON("1", "人员"),
    FACE("2", "人脸"),
    MOTO_VEHICLE("3", "机动车"),
    NON_MOTO_VEHICLE("4", "非机动车"),
    KEYWORD("5", "关键字");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    DispositionCategoryType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
