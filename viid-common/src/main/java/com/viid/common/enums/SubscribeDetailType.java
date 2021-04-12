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
 * SubscribeDetailType
 * 订阅类别
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum SubscribeDetailType {

    /**
     * 序号	消息中取值	说明
     * 1	1	案（事）件目录
     * 2	2	单个案（事）件内容
     * 3	3	采集设备目录
     * 4	4	采集设备状态
     * 5	5	采集系统目录
     * 6	6	采集系统状态
     * 7	7	视频卡口目录
     * 8	8	单个卡口记录
     * 9	9	车道目录
     * 10	10	单个车道记录
     * 11	11	自动采集的人员信息
     * 12	12	自动采集的人脸信息
     * 13	13	自动采集的车辆信息
     * 14	14	自动采集的非机动车辆信息
     * 15	15	自动采集的物品信息
     * 16	16	自动采集的文件信息
     */
    CASE_LIST("1","案（事）件目录"),
    SINGLE_CASE_CONTENT("2","单个案（事）件内容"),
    COLLECTION_EQUIPMENT_CATALOG("3","采集设备目录"),
    COLLECT_DEVICE_STATUS("4","采集设备状态"),
    ACQUISITION_SYSTEM_CATALOG("5","采集系统目录"),
    COLLECT_SYSTEM_STATUS("6","采集系统状态"),
    VIDEO_BAYONET_CATALOG("7","视频卡口目录"),
    SINGLE_BAYONET_RECORD("8","单个卡口记录"),
    LANE_DIRECTORY("9","车道目录"),
    SINGLE_LANE_RECORDING("10","单个车道记录"),
    AUTOMATICALLY_COLLECTED_PERSONNEL_INFORMATION("11","自动采集的人员信息"),
    AUTOMATICALLY_COLLECTED_FACE_INFORMATION("12","自动采集的人脸信息"),
    AUTOMATICALLY_COLLECTED_VEHICLE_INFORMATION("13","自动采集的车辆信息"),
    AUTOMATICALLY_COLLECTED_NON_MOTOR_VEHICLE_INFORMATION("14","自动采集的非机动车辆信息"),
    AUTOMATICALLY_COLLECTED_ITEM_INFORMATION("15","自动采集的物品信息"),
    AUTOMATICALLY_COLLECTED_FILE_INFORMATION("16","自动采集的文件信息");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    SubscribeDetailType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
