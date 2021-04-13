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
 * SecretLevelType
 * 密级代码
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 15:36
 * @since 0.1.0
 */

@Getter
public enum SecretLevelType {
    /**
     * 序号	消息中取值	说明
     * 1	1	绝密
     * 2	2	机密
     * 3	3	秘密
     * 4	4	内部
     * 5	5	公开
     * 6	9	其他
     */

    TOP_SECRET("1", "绝密"),
    CONFIDENTIAL("2", "机密"),
    SECRET("3", "秘密"),
    INTERNAL("4", "内部"),
    PUBLIC("5", "公开"),
    OTHER("9", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    SecretLevelType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
