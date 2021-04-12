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
 * QualityGradeType
 * 质量等级
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 19:26
 * @since 0.1.0
 */

@Getter
public enum QualityGradeType {
    
    /**
     * 序号	消息中取值	说明
     * 1	1	极差
     * 2	2	较差
     * 3	3	一般
     * 4	4	较好
     * 5	5	很好
     */

    POOR("1", "极差"),
    FAIR("2", "较差"),
    AVERAGE("3", "一般"),
    GOOD("4", "较好"),
    EXCELLENT("5", "很好");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    QualityGradeType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
