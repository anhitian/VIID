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
 * VideoCodeFormatType
 * 视频编码格式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-12 14:24
 * @since 0.1.0
 */

@Getter
public enum VideoCodeFormatType {
    /**
     * 序号	消息中取值	说明
     * 1	1	SVAC
     * 2	2	H.264
     * 3	3	MPEG-4
     * 4	4	MPEG-2
     * 5	5	MJPEG
     * 6	6	H.263
     * 7	7	H.265
     * 8	99	其他
     */
    SVAC("1", "SVAC"),
    H264("2", "H.264"),
    MPEG4("3", "MPEG-4"),
    MPEG2("4", "MPEG-2"),
    MJPEG("5", "MJPEG"),
    H263("6", "H.263"),
    H265("7", "H.265"),
    OTHER("99", "其他");
    
    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    VideoCodeFormatType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
