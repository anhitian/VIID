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
 * PassportType
 * 护照证件种类
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum PassportType {


    /**
     * 序号	消息中取值	说明
     * 1	11	外交护照
     * 2	12	公务护照
     * 3	13	因公普通护照
     * 4	14	普通护照
     * 5	15	中华人民共和国旅行证
     * 6	16	台湾居民来往大陆通行证
     * 7	17	海员证
     * 8	18	机组人员证
     * 9	19	铁路员工证
     * 10	20	中华人民共和国出入境通行证
     * 11	21	往来港澳通行证
     * 12	23	前往港澳通行证
     * 13	24	港澳同胞回乡证
     * 14	25	大陆居民往来台湾通行证
     * 15	27	往来香港澳门特别行政区通行证
     * 16	28	华侨回国定居证
     * 17	29	台湾同胞定居证
     * 18	30	外国人出入境证
     * 19	31	外国人旅行证
     * 20	32	外国人居留证
     * 21	33	外国人临时居留证
     * 22	35	入籍证书
     * 23	36	出籍证书
     * 24	37	复籍证书
     * 25	38	暂住证
     * 26	40	出海渔船民证
     * 27	41	临时出海渔船民证
     * 28	42	出海船舶户口薄
     * 29	43	出海船舶户口证
     * 30	44	粤港澳流动渔民证
     * 31	45	粤港澳临时流动渔民证
     * 32	46	粤港澳流动渔船户口薄
     * 33	47	搭靠台轮许可证
     * 34	48	劳务人员登轮作业证
     * 35	49	台湾居民登陆证
     * 36	50	贸易证
     * 37	60	边境通行证
     * 38	61	深圳市过境耕作证
     * 39	70	香港特别行政区护照
     * 40	71	澳门特别行政区护照
     * 41	81	缅甸中方（缅方）通行证
     * 42	82	云南边境地区境外边民出入境证
     * 43	90	中朝边境地区出入境通行证
     * 44	91	朝中边境地区居民过境通行证
     * 45	92	鸭绿江、图们江水文作业证
     * 46	93	中朝流筏固定代表证
     * 47	94	中朝（朝中）鸭绿江、图们江航行船舶船员证
     * 48	95	中朝（朝中）边境地区公安总代表证
     * 49	96	中朝（朝中）边境地区公安副总代表证
     * 50	97	中朝（朝中）边境地区公安代表证
     * 51	99	其他证件
     */

    DIPLOMATIC_PASSPORT("11", "外交护照"),
    OFFICIAL_PASSPORTS("12", "公务护照"),
    ORDINARY_PASSPORT_FOR_BUSINESS("13", "因公普通护照"),
    ORDINARY_PASSPORT("14", "普通护照"),
    PEOPLE_REPUBLIC_OF_CHINA_TRAVEL_PERMIT("15", "中华人民共和国旅行证"),
    MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS("16", "台湾居民来往大陆通行证"),
    SEAMAN_CERTIFICATE("17", "海员证"),
    CREW_CARD("18", "机组人员证"),
    RAILWAY_EMPLOYEE_CERTIFICATE("19", "铁路员工证"),
    ENTRY_AND_EXIT_PERMIT_FOR_THE_PEOPLE_REPUBLIC_OF_CHINA("20", "中华人民共和国出入境通行证"),
    PASS_TO_AND_FROM_HONG_KONG_AND_MACAU("21", "往来港澳通行证"),
    PASS_TO_HONG_KONG_AND_MACAU("23", "前往港澳通行证"),
    HOMECOMING_PERMIT_FOR_HONG_KONG_AND_MACAO_COMPATRIOTS("24", "港澳同胞回乡证"),
    TRAVEL_PERMIT_FOR_MAINLAND_RESIDENTS_TO_AND_FROM_TAIWAN("25", "大陆居民往来台湾通行证"),
    PASS_TO_AND_FROM_HONG_KONG_AND_MACAU_SPECIAL_ADMINISTRATIVE_REGION("27", "往来香港澳门特别行政区通行证"),
    OVERSEAS_CHINESE_RETURN_HOME_RESIDENCE_PERMIT("28", "华侨回国定居证"),
    TAIWAN_COMPATRIOTS_RESIDENCE_PERMIT("29", "台湾同胞定居证 "),
    FOREIGNER_ENTRY_AND_EXIT_PERMIT("30", "外国人出入境证"),
    FOREIGNER_TRAVEL_PERMIT("31", "外国人旅行证"),
    RESIDENCE_PERMIT_FOR_FOREIGNERS("32", "外国人居留证"),
    TEMPORARY_RESIDENCE_PERMIT_FOR_FOREIGNERS("33", "外国人临时居留证"),
    NATURALIZATION_CERTIFICATE("35", "入籍证书"),
    CERTIFICATE_OF_NATURALIZATION("36", "出籍证书"),
    CERTIFICATE_OF_REINSTATEMENT("37", "复籍证书"),
    TEMPORARY_RESIDENCE_PERMIT("38", "暂住证"),
    PEOPLE_CERTIFICATE_FOR_FISHING_VESSELS_GOING_TO_SEA("40", "出海渔船民证"),
    TEMPORARY_FISHING_VESSEL_CERTIFICATE("41", "临时出海渔船民证"),
    THIN_ACCOUNT_OF_SHIPS_GOING_TO_SEA("42", "出海船舶户口薄"),
    SHIP_ACCOUNT_CARD("43", "出海船舶户口证"),
    GUANGDONG_HONG_KONG_MACAO_MOBILE_FISHERMEN_CARD("44", "粤港澳流动渔民证"),
    GUANGDONG_HONG_KONG_MACAO_TEMPORARY_MOBILE_FISHERMEN_PERMIT("45", "粤港澳临时流动渔民证"),
    GUANGDONG_HONG_KONG_MACAO_MOBILE_FISHING_BOAT_ACCOUNT_IS_THIN("46", "粤港澳流动渔船户口薄"),
    LICENSING_PLATFORM_WHEEL_PERMIT("47", "搭靠台轮许可证"),
    WORKERS_BOARDING_WORK_PERMIT("48", "劳务人员登轮作业证"),
    TAIWAN_RESIDENT_REGISTRATION_CARD("49", "台湾居民登陆证"),
    TRADE_CERTIFICATE("50", "贸易证"),
    BORDER_PASS("60", "边境通行证"),
    SHENZHEN_TRANSIT_FARMING_TESTIMONY("61", "深圳市过境耕作证"),
    HONG_KONG_SPECIAL_ADMINISTRATIVE_REGION_PASSPORT("70", "香港特别行政区护照"),
    MACAO_SPECIAL_ADMINISTRATIVE_REGION_PASSPORT("71", "澳门特别行政区护照"),
    MYANMAR_CHINESE_PASS("81", "缅甸中方（缅方）通行证  "),
    ENTRY_EXIT_PERMIT_FOR_FOREIGN_BORDER_RESIDENTS_IN_YUNNAN_BORDER_AREA("82", "云南边境地区境外边民出入境证"),
    ENTRY_AND_EXIT_PERMITS_FOR_THE_BORDER_AREA_BETWEEN_CHINA_AND_NORTH_KOREA("90", "中朝边境地区出入境通行证"),
    TRANSIT_PASS_FOR_RESIDENTS_OF_NORTH_KOREA_CHINA_BORDER_AREA("91", "朝中边境地区居民过境通行证"),
    YALU_RIVER_AND_TUMEN_RIVER_HYDROLOGICAL_OPERATION_CERTIFICATE("92", "鸭绿江、图们江水文作业证"),
    CHINA_NORTH_KOREA_FLOW_RAFT_FIXED_REPRESENTATIVE_CARD("93", "中朝流筏固定代表证"),
    CREW_CERTIFICATE_FOR_CHINESE_KOREAN_YALU_RIVER_AND_TUMEN_RIVER_SAILING_VESSELS("94", "中朝（朝中）鸭绿江、图们江航行船舶船员证"),
    CHINA_DPRK_BORDER_AREA_PUBLIC_SECURITY_REPRESENTATIVE_CARD("95", "中朝（朝中）边境地区公安总代表证"),
    CHINA_DPRK_DEPUTY_CHIEF_PUBLIC_SECURITY_REPRESENTATIVE_CARD("96", "中朝（朝中）边境地区公安副总代表证"),
    PUBLIC_SECURITY_REPRESENTATIVE_CARD_IN_THE_BORDER_AREA_BETWEEN_CHINA_AND_NORTH_KOREA("97", "中朝（朝中）边境地区公安代表证"),
    OTHER_DOCUMENTS("99", "其他证件");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    PassportType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
