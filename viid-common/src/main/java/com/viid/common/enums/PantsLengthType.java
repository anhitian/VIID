package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * PantsLengthType
 * 裤子长度
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:16
 * @since 0.1.0
 */

@Getter
public enum PantsLengthType {
    
    /**
     * 序号	消息中取值	说明
     * 1	1	长裤
     * 2	2	短裤
     */

    TROUSERS("1", "长裤"),
    SHORTS("2", "短裤");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    PantsLengthType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
