package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * VideoImageInfoAttributeType
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/17
 * @since 0.1.0
 **/

@Getter
public enum VideoImageInfoAttributeType {



    /**
     * 01-人员
     * 02-机动车
     * 03-非机动车
     * 04-物品
     * 05-场景
     * 06-人脸
     * 07-视频图像标签
     * 99-其他
     */
    PERSON("01","人员"),
    MOTOR_VEHICLE("02","机动车"),
    NON_MOTOR_VEHICLE("03","非机动车"),
    THING("04","物品"),
    SCENE("05","场景"),
    FACE("06","人脸"),
    VIDEO_IMAGE_TAG("07","视频图像标签"),
    OTHER("99","其他");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    VideoImageInfoAttributeType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
