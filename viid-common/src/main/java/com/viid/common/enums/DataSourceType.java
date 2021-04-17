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
 * DataSourceType
 * 视频图像数据来源
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/12
 * @since 0.1.0
 **/
@Getter
public enum DataSourceType {

    /**
     * 序号	消息中取值	说明
     * 1	1	政府机关监控
     * 2	2	社会面治安监控
     * 3	3	交通监控（含轨道交通监控）
     * 4	4	出入境监控
     * 5	5	港口监控
     * 6	6	金融系统监控
     * 7	7	旅馆监控
     * 8	8	互联网营业场所监控
     * 9	9	娱乐服务场所监控
     * 10	10	其他企业/事业单位监控
     * 11	11	居民自建监控
     * 12	12	公安内部
     * 13	13	监所
     * 14	14	讯问室
     * 15	15	车（船、直升机等）载终端拍摄
     * 16	16	移动执法
     * 17	17	手机、平板电脑拍摄
     * 18	18	DV拍摄
     * 19	19	相机拍摄
     * 20	20	网络获取
     * 21	21	声像资料片
     * 22	99	其他
     */
    GOVERNMENT_MONITOR("1", "政府机关监控"),
    SOCIAL_SECURITY_MONITOR("2", "社会面治安监控"),
    TRAFFIC_MONITOR("3", "社会面治安监控"),
    ENTRY_EXIT_MONITOR("4", "出入境监控"),
    PORT_MONITOR("5", "港口监控"),
    FINANCIAL_SYSTEM_MONITOR("6", "金融系统监控"),
    HOSTEL_MONITOR("7", "旅馆监控"),
    INTERNET_BUSINESS_PREMISES_MONITOR("8", "互联网营业场所监控"),
    ENTERTAINMENT_SERVICE_PLACES_MONITOR("9", "娱乐服务场所监控"),
    ENTERPRISE_MONITOR("10", "其他企业/事业单位监控"),
    RESIDENT_SELF_BUILT_MONITOR("11", "居民自建监控"),
    PUBLIC_SECURITY_MONITOR("12", "公安内部"),
    PRISON_MONITOR("13", "监所"),
    INTERROGATION_ROOM_MONITOR("14", "讯问室"),
    VEHICLE_TERMINAL_MONITOR("15", "车（船、直升机等）载终端拍摄"),
    MOBILE_LAW_ENFORCEMENT_MONITOR("16", "移动执法"),
    MOBILE_PHONE_TABLET_COMPUTER_SHOOTING_MONITOR("17", "手机、平板电脑拍摄"),
    DV_SHOOTING_MONITOR("18", "DV拍摄"),
    CAMERA_SHOOTING_MONITOR("19", "相机拍摄"),
    INTERNET_ACCESS_MONITOR("20", "网络获取"),
    AUDIOVISUAL_EXPANSION_MONITOR("21", "声像资料片"),
    OTHER_MONITOR("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    DataSourceType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
