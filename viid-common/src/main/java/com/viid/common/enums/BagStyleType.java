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
 * BagStyleType
 * 包款式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:12
 * @since 0.1.0
 */

@Getter
public enum BagStyleType {
    /**
     * 序号	消息中取值	说明
     * 1	1	单肩包
     * 2	2	手提包
     * 3	3	双肩包
     * 4	4	钱包
     * 5	5	手拿包
     * 6	6	腰包
     * 7	7	钥匙包
     * 8	8	卡包
     * 9	9	手拉箱
     * 10	10	旅行包
     * 11	11	牛仔包
     * 12	12	斜挎包
     * 13	99	其他
     */

    SHOULDER_BAG("1", "单肩包"),
    HANDBAG("2", "手提包"),
    BACKPACK("3", "双肩包"),
    WALLET("4", "钱包"),
    CLUTCH_BAG("5", "手拿包"),
    WAIST_BAG("6", "腰包"),
    KEY_CASE("7", "钥匙包"),
    CARD_PACKAGE("8", "卡包"),
    SUITCASE("9", "手拉箱"),
    TRAVEL_BAG("10", "旅行包"),
    DENIM_BAG("11", "牛仔包"),
    MESSENGER_BAG("", "斜挎包"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    BagStyleType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
