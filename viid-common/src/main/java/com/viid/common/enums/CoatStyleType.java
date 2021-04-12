package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * CoatStyleType
 * 上衣款式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 20:13
 * @since 0.1.0
 */

@Getter
public enum CoatStyleType {

    /**
     * 序号	消息中取值	说明
     * 1	1	西装
     * 2	2	民族服
     * 3	3	T恤
     * 4	4	衬衫
     * 5	5	卫衣
     * 6	6	夹克
     * 7	7	皮夹克
     * 8	8	大衣
     * 9	9	风衣
     * 10	10	毛衣
     * 11	11	棉衣
     * 12	12	羽绒服
     * 13	13	运动服
     * 14	14	工作服
     * 15	15	牛仔服
     * 16	16	睡衣
     * 17	17	连衣裙
     * 18	18	无上衣
     * 19	99	其他
     */

    SUIT("1", "西装"),
    NATIONAL_CLOTHES("2", "民族服"),
    T_SHIRT("3", "T恤"),
    SHIRT("4", "衬衫"),
    HOODIE("5", "卫衣"),
    JACKET("6", "夹克"),
    LEATHER_JACKET("7", "皮夹克"),
    OVERCOAT("8", "大衣"),
    WINDBREAKER("9", "风衣"),
    SWEATER("10", "毛衣"),
    COTTON("11", "棉衣"),
    DOWN_JACKET("12", "羽绒服"),
    SPORTSWEAR("13", "运动服"),
    WORK_CLOTHES("14", "工作服"),
    JEANS("15", "牛仔服"),
    PAJAMAS("16", "睡衣"),
    DRESS("17", "连衣裙"),
    TOPLESS("18", "无上衣"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    CoatStyleType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
