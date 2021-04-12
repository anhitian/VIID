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
 * EventType
 * 视频图像分析处理事件类型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum EventType {


    /**
     * 序号	消息中取值	功能分类	功能	说明
     * 1	0		其他
     * 2	1	卡口	过车
     * 3	2	卡口	过人
     * 4	3	卡口	打架
     * 5	4	卡口	快速奔跑
     * 6	5	目标检测与特征提取	运动目标检测
     * 7	6	目标检测与特征提取	目标分类
     * 8	7	目标检测与特征提取	目标颜色检测
     * 9	8	目标检测与特征提取	行人检测
     * 10	9	目标检测与特征提取	人员属性分析
     * 11	10	目标检测与特征提取	人脸检测
     * 12	11	目标检测与特征提取	人脸比对
     * 13	12	目标检测与特征提取	车辆检测
     * 14	13	目标检测与特征提取	车辆比对
     * 15	14	目标数量分析	流量统计
     * 16	15	目标数量分析	密度检测
     * 17	16	目标识别	车牌识别
     * 18	17	目标识别	车辆基本特征识别
     * 19	18	目标识别	车辆个体特征识别
     * 20	19	行为分析	绊线检测
     * 21	20	行为分析	入侵检测
     * 22	21	行为分析	逆行检测
     * 23	22	行为分析	徘徊检测
     * 24	23	行为分析	遗留物检测
     * 25	24	行为分析	目标移除检测
     * 26	25	视频摘要	视频摘要
     * 27	26	视频增强与复原	去雾
     * 28	27	视频增强与复原	去模糊
     * 29	28	视频增强与复原	对比度增强
     * 30	29	视频增强与复原	低照度视频图像增强
     * 31	30	视频增强与复原	偏色校正
     * 32	31	视频增强与复原	宽动态增强
     * 33	32	视频增强与复原	超分辨率重建
     * 34	33	视频增强与复原	几何畸变校正
     * 35	34	视频增强与复原	奇偶场校正
     * 36	35	视频增强与复原	颜色空间分量分离
     * 37	36	视频增强与复原	去噪声
     */
    OTHER(0,"","其他"),
    PASSING_CAR(1,"卡口","过车"),
    EXTRAORDINARY(2,"卡口","过人"),
    FIGHT(3,"卡口","打架"),
    RUNNING_FAST(4,"卡口","快速奔跑"),
    MOVING_TARGET_DETECTION(5,"目标检测与特征提取","运动目标检测"),
    TARGET_CLASSIFICATION(6,"目标检测与特征提取","目标分类"),
    TARGET_COLOR_DETECTION(7,"目标检测与特征提取","目标颜色检测"),
    PEDESTRIAN_DETECTION(8,"目标检测与特征提取","行人检测"),
    PERSONNEL_ATTRIBUTE_ANALYSIS(9,"目标检测与特征提取","人员属性分析"),
    FACE_DETECTION(10,"目标检测与特征提取","人脸检测"),
    FACE_COMPARISON(11,"目标检测与特征提取","人脸比对"),
    VEHICLE_INSPECTION(12,"目标检测与特征提取","车辆检测"),
    VEHICLE_COMPARISON(13,"目标检测与特征提取","车辆比对"),
    TRAFFIC_STATISTICS(14,"目标数量分析","流量统计"),
    DENSITY_DETECTION(15,"目标数量分析","密度检测"),
    LICENSE_PLATE_RECOGNITION(16,"目标识别","车牌识别"),
    VEHICLE_BASIC_FEATURE_RECOGNITION(17,"目标识别","车辆基本特征识别"),
    VEHICLE_INDIVIDUAL_FEATURE_RECOGNITION(18,"目标识别","车辆个体特征识别"),
    TRIPWIRE_DETECTION(19,"行为分析","绊线检测"),
    INTRUSION_DETECTION(20,"行为分析","入侵检测"),
    RETROGRADE_DETECTION(21,"行为分析","逆行检测"),
    WANDERING_DETECTION(22,"行为分析","徘徊检测"),
    LEFTOVER_DETECTION(23,"行为分析","遗留物检测"),
    TARGET_REMOVAL_DETECTION(24,"行为分析","目标移除检测"),
    VIDEO_SUMMARY(25,"视频摘要","视频摘要"),
    DEHAZE(26,"视频增强与复原","去模糊"),
    DEBLUR(27,"视频增强与复原","去模糊"),
    CONTRAST_ENHANCEMENT(28,"视频增强与复原","对比度增强"),
    LOW_ILLUMINATION_VIDEO_IMAGE_ENHANCEMENT(29,"视频增强与复原","低照度视频图像增强"),
    COLOR_CAST_CORRECTION(30,"视频增强与复原","宽动态增强"),
    WIDE_DYNAMIC_ENHANCEMENT(31,"视频增强与复原","宽动态增强"),
    SUPER_RESOLUTION_RECONSTRUCTION(32,"视频增强与复原","超分辨率重建"),
    GEOMETRIC_DISTORTION_CORRECTION(33,"视频增强与复原","几何畸变校正"),
    PARITY_FIELD_CORRECTION(34,"视频增强与复原","奇偶场校正"),
    COLOR_SPACE_COMPONENT_SEPARATION(35,"视频增强与复原","颜色空间分量分离"),
    DE_NOISE(36,"视频增强与复原","去噪声");


    @JsonValue
    @EnumValue
    private final Integer code;

    private final String category;
    private final String desc;

    EventType(Integer code,String category, String desc) {
        this.code = code;
        this.category=category;
        this.desc = desc;
    }
}
