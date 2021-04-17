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
 * PlateClassType
 * 号牌种类
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum PlateClassType {

    /**
     * 序号	消息中取值	说明
     * 1	01	大型汽车号牌
     * 2	02	小型汽车号牌
     * 3	03	使馆汽车号牌
     * 4	04	领馆汽车号牌
     * 5	05	境外汽车号牌
     * 6	06	外籍汽车号牌
     * 7	07	普通摩托车号牌
     * 8	08	轻便摩托车号牌
     * 9	09	使馆摩托车号牌
     * 10	10	领馆摩托车号牌
     * 11	11	境外摩托车号牌
     * 12	12	外籍摩托车号牌
     * 13	13	低速车号牌
     * 14	14	拖拉机号牌
     * 15	15	挂车号牌
     * 16	16	教练汽车号牌
     * 17	17	教练摩托车号牌
     * 20	20	临时入境汽车号牌
     * 21	21	临时入境摩托车号牌
     * 22	22	临时行驶车号牌
     * 23	23	警用汽车号牌
     * 24	24	警用摩托车号牌
     * 25	25	原农机号牌
     * 26	26	香港入出境号牌
     * 27	27	澳门入出境号牌
     * 31	31	武警号牌
     * 32	32	军队号牌
     * 33	99	其他号牌
     */
    LARGE_CAR_NUMBER_PLATE("01", "大型汽车号牌"),
    SMALL_CAR_NUMBER_PLATE("02", "小型汽车号牌"),
    EMBASSY_CAR_NUMBER_PLATE("03", "使馆汽车号牌"),
    CONSULATE_CAR_NUMBER_PLATE("04", "领馆汽车号牌"),
    OVERSEAS_CAR_NUMBER_PLATE("05", "境外汽车号牌"),
    FOREIGN_CAR_NUMBER_PLATE("06", "外籍汽车号牌"),
    ORDINARY_MOTORCYCLE_NUMBER_PLATE("07", "普通摩托车号牌"),
    MOPED_NUMBER_PLATE("08", "轻便摩托车号牌"),
    EMBASSY_MOTORCYCLE_NUMBER_PLATE("09", "使馆摩托车号牌"),
    CONSULATE_MOTORCYCLE_NUMBER_PLATE("10", "领馆摩托车号牌"),
    FOREIGN_MOTORCYCLE_LICENSE_PLATE("11", "境外摩托车号牌"),
    FOREIGN_MOTORCYCLE_NUMBER_PLATE("12", "外籍摩托车号牌"),
    LOW_SPEED_CAR_NUMBER_PLATE("13", "低速车号牌"),
    TRACTOR_NUMBER_PLATE("14", "拖拉机号牌"),
    TRAILER_NUMBER_PLATE("15", "挂车号牌"),
    COACH_CAR_NUMBER_PLATE("16", "教练汽车号牌"),
    COACH_MOTORCYCLE_NUMBER_PLATE("17", "教练摩托车号牌"),
    TEMPORARY_ENTRY_VEHICLE_NUMBER_PLATE("20", "临时入境汽车号牌"),
    TEMPORARY_ENTRY_MOTORCYCLE_NUMBER_PLATE("21", "临时入境摩托车号牌"),
    TEMPORARY_DRIVING_LICENSE_PLATE("22", "临时行驶车号牌"),
    POLICE_CAR_NUMBER_PLATE("23", "警用汽车号牌"),
    POLICE_MOTORCYCLE_NUMBER_PLATE("24", "警用摩托车号牌"),
    ORIGINAL_AGRICULTURAL_MACHINERY_NUMBER_PLATE("25", "原农机号牌"),
    HONG_KONG_ENTRY_AND_EXIT_NUMBER_PLATE("26", "香港入出境号牌"),
    MACAU_ENTRY_AND_EXIT_NUMBER_PLATE("27", "澳门入出境号牌"),
    ARMED_POLICE_NUMBER_PLATE("31", "武警号牌"),
    ARMY_NUMBER_PLATE("32", "军队号牌"),
    OTHER_NUMBER_PLATES("99", "其他号牌");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    PlateClassType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
