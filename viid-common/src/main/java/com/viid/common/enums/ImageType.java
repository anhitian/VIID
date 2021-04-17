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
 * ImageType
 * 图像类型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/12
 * @since 0.1.0
 **/

@Getter
public enum ImageType {

    /**
     * 序号	消息中取值	说明
     * 1	01	车辆大图
     * 2	02	车牌彩色小图
     * 3	03	车牌二值化图
     * 4	04	驾驶员面部特征图
     * 5	05	副驾驶面部特征图
     * 6	06	车标
     * 7	07	违章合成图
     * 8	08	过车合成图
     * 9	09	车辆特写图
     * 10	10	人员图
     * 11	11	人脸图
     * 12	12	非机动车图
     * 13	13	物品图
     * 14	14	场景图
     * 15	100	一般图片
     */
    VEHICLE_SCENE_IMAGE("01", "车辆大图"),
    VEHICLE_SCENE("02", "车牌二值化图"),
    VEHICLE_PLATE_BINARIZATION_IMAGE("03", "车牌二值化图"),
    DRIVER_FACE_FEATURE_IMAGE("04", "驾驶员面部特征图"),
    COPILOT_FACE_FEATURE_IMAGE("05", "副驾驶面部特征图"),
    VEHICLE_LOGO_IMAGE("06", "车标"),
    VIOLATION_COMPOSITE_IMAGE("07", "违章合成图"),
    VEHICLE_COMPOSITE_IMAGE("08", "过车合成图"),
    VEHICLE_FEATURE_IMAGE("09", "车辆特写图"),
    PERSON_IMAGE("10", "人员图"),
    FACE_IMAGE("11", "人脸图"),
    NON_MOTOR_VEHICLE_IMAGE("12", "非机动车图"),
    THING_IMAGE("13", "物品图"),
    SCENE_IMAGE("14", "场景图"),
    COMMON_IMAGE("100", "一般图片");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    ImageType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
