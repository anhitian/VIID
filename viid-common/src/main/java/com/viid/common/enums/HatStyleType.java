package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * HatStyleType
 * 帽子款式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:10
 * @since 0.1.0
 */

@Getter
public enum HatStyleType {
    /**
     * 序号	消息中取值	说明
     * 1	1	毛线帽
     * 2	2	贝雷帽
     * 3	3	棒球帽
     * 4	4	平项帽
     * 5	5	渔夫帽
     * 6	6	套头帽
     * 7	7	鸭舌帽
     * 8	8	大檐帽
     * 9	99	其他
     */


    WOOL_CAP("1", "毛线帽"),
    BERETS("2", "贝雷帽"),
    BASEBALL_CAP("3", "棒球帽"),
    FLAT_HAT("4", "平项帽"),
    FISHERMAN_HAT("5", "渔夫帽"),
    HEDGING_CAP("6", "套头帽"),
    PEAKED_CAP("7", "鸭舌帽"),
    BIG_BRIMMED_HAT("8", "大檐帽"),
    OTHER("99", "其他");
    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    HatStyleType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
