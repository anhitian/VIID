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
 * HabitualActionType
 * 习惯动作
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 19:52
 * @since 0.1.0
 */
@Getter
public enum HabitualActionType {


    /**
     * 序号	消息中取值	说明
     * 1	1	翻眼
     * 2	2	眨眼
     * 3	3	皱眉
     * 4	4	挑眉
     * 5	5	推镜
     * 6	6	抓头
     * 7	7	挖鼻
     * 8	8	摸下巴
     * 9	9	打手势
     * 10	10	左撇子
     * 11	11	缩颈
     * 12	12	走路摇摆
     * 13	13	外八字
     * 14	14	内八字
     * 15	15	面肌抽搐
     * 16	16	说话歪嘴
     * 17	17	摆头
     * 18	18	手抖
     * 19	99	其他
     */
    ROLL_EYES("1", "翻眼"),
    WINK("2", "眨眼"),
    FROWN("3", "皱眉"),
    RAISE_EYEBROWS("4", "挑眉"),
    PUSH_GLASSES("5", "推镜"),
    SCRATCH_HEAD("6", "抓头"),
    NOSE_PICK("7", "挖鼻"),
    TOUCH_CHIN("8", "摸下巴"),
    GESTURING("9", "打手势"),
    LEFT_HANDED("10", "左撇子"),
    NECKING("11", "缩颈"),
    WALK_SWING("12", "走路摇摆"),
    OUTER_SPLAYED_FEET("13", "外八字"),
    INNER_SPLAYED_FEET("14", "内八字"),
    FACIAL_TWITCHES("15", "面肌抽搐"),
    SPEAK_CROOKED_MOUTH("16", "说话歪嘴"),
    SWING_HEAD("17", "摆头"),
    SHAKING_HANDS("18", "手抖"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    HabitualActionType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
