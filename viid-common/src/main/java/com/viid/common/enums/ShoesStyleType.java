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
 * ShoesStyleType
 * 鞋子款式
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum ShoesStyleType {


    /**
     * 序号	消息中取值	说明
     * 1	1	板鞋
     * 2	2	皮鞋
     * 3	3	运动鞋
     * 4	4	拖鞋
     * 5	5	凉鞋
     * 6	6	休闲鞋
     * 7	7	高筒靴
     * 8	8	中筒靴
     * 9	9	低筒靴
     * 10	10	登山靴
     * 11	11	军装靴
     * 12	12	无靴子
     * 13	99	其他
     */
    SNEAKERS("1","板鞋"),
    LEATHER_SHOES("2","皮鞋"),
    SPORTS_SHOES("3","运动鞋"),
    FLIP_FLOP("4","拖鞋"),
    SANDALS("5","凉鞋"),
    CASUAL_SHOES("6","休闲鞋"),
    HIGH_BOOTS("7","高筒靴"),
    MID_BOOTS("8","中筒靴"),
    LOW_BOOTS("9","低筒靴"),
    HIKING_BOOTS("10","登山靴"),
    MILITARY_BOOTS("11","军装靴"),
    NO_BOOTS("12","无靴子"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    ShoesStyleType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
