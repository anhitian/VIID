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
 * InfoType
 * 视频图像信息类型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum InfoType {

    /**
     * 序号	消息中取值	分类	说明
     * 1	0	其他
     * 2	1	自动采集	采集设备及视频分析系统采集
     * 3	2	人工采集	人工采集通过应用平台输入
     */
    OTHER(0,"其他"),
    AUTOMATIC_COLLECTION(1,"自动采集 采集设备及视频分析系统采集"),
    MANUAL_COLLECTION(2,"人工采集 人工采集通过应用平台输入");

    @JsonValue
    @EnumValue
    private final Integer code;

    private final String desc;

    InfoType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
