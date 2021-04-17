package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * VideoImageInfoType
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/17
 * @since 0.1.0
 **/
@Getter
public enum VideoImageInfoType {

    /**
     * 01-视频片段
     * 02-图像
     * 03-文件
     * 99-其他
     */
    VIDEO("01","视频片段"),
    IMAGE("02","图像"),
    FILE("03","文件"),
    OTHER("99","其他");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    VideoImageInfoType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
