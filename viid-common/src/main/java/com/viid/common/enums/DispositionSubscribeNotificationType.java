package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * DispositionSubscribeNotificationType
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/17
 * @since 0.1.0
 **/
@Getter
public enum DispositionSubscribeNotificationType {

    /**
     * 01-布/撤控
     * 02-告警
     * 03-订阅
     * 04-通知
     * 99-其它
     */
    DISPOSITION("01", "布/撤控"),
    DISPOSITION_NOTIFICATION("02","告警"),
    SUBSCRIBE("03","订阅"),
    NOTIFICATION("04","通知"),
    OTHER("99","其他");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    DispositionSubscribeNotificationType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
