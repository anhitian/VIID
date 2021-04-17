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
 * BehaviorType
 * 行为
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:08
 * @since 0.1.0
 */

@Getter
public enum BehaviorType {

    /**
     * 序号	消息中取值	说明
     * 1	1	尾随
     * 2	2	徘徊
     * 3	3	取款
     * 4	4	打架
     * 5	5	开车
     * 6	6	打手机
     * 7	99	其他
     */
    TRAILING("1", "尾随"),
    WANDERING("2", "徘徊"),
    WITHDRAWAL("3", "取款"),
    FIGHT("4", "打架"),
    DRIVE("5", "开车"),
    CALL("6", "打手机"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    BehaviorType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
