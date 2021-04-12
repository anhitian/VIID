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
 * AudioCodeFormatType
 * 音频编码格式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 14:20
 * @since 0.1.0
 */

@Getter
public enum AudioCodeFormatType {

    /**
     * 序号	消息中取值	说明
     * 1	1	G.711a
     * 2	2	G.711u
     * 3	3	G.723
     * 4	4	G.729
     * 5	5	SVAC
     * 6	99	其他
     */
    G711A("1", "G.711a"),
    G711U("2", "G.711u"),
    G723("3", "G.723"),
    G729("4", "G.729"),
    SVAC("5", "SVAC"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    AudioCodeFormatType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
