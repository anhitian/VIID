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
 * GlassesStyleType
 * 眼镜款式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:11
 * @since 0.1.0
 */

@Getter
public enum GlassesStyleType {

    /**
     * 序号	消息中取值	说明
     * 1	1	全框
     * 2	2	半框
     * 3	3	无框
     * 4	4	眉线框
     * 5	5	多功能框
     * 6	6	变色镜
     * 7	7	太阳镜
     * 8	8	无镜片
     * 9	9	透明色
     * 10	99	其他
     */

    OTHER("99", "其他");
    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    GlassesStyleType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
