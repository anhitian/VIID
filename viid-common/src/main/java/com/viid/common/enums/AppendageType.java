package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * AppendageType
 * 附属物
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:09
 * @since 0.1.0
 */

@Getter
public enum AppendageType {

    /**
     * 序号	消息中取值	说明
     * 1	1	手机
     * 2	2	伞
     * 3	3	口罩
     * 4	4	手表
     * 5	5	头盔
     * 6	6	眼镜
     * 7	7	帽子
     * 8	8	包
     * 9	9	围巾
     * 10	99	其他
     */
    PHONE("1", "手机"),
    UMBRELLA("2", "伞"),
    FACE_MASK("3", "口罩"),
    WATCH("4", "手表"),
    HELMET("5", "头盔"),
    GLASSES("6", "眼镜"),
    HAT("7", "帽子"),
    BAG("8", "包"),
    SCARF("9", "围巾"),
    OTHER("99", "其他");
    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    AppendageType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
