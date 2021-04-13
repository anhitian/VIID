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
 * ConfirmStatusType
 * 确认状态
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/
@Getter
public enum ConfirmStatusType {
    /**
     * 序号	消息中取值	说明
     * 1	0	正常
     * 2	1	未知错误
     * 2	2	繁忙
     * 3	3	错误
     * 4	4	无效操作
     * 5	5	无效XML格式
     * 6	6	无效XML内容
     * 7	7	JSON格式无效
     * 8	8	JSON内容无效
     * 9	9	系统重启中
     */
    NORMAL("0", "正常"),
    UNKNOWN_ERROR("1", "未知错误"),
    BUSY("2", "繁忙"),
    ERROR("3", "错误"),
    INVALID_OPERATION("4", "无效操作"),
    INVALID_XML_FORMAT("5", "无效XML格式"),
    INVALID_XML_CONTENT("6", "无效XML内容"),
    INVALID_JSON_FORMAT("7", "JSON格式无效"),
    INVALID_JSON_CONTENT("8", "JSON内容无效"),
    SYSTEM_REBOOT("9", "系统重启中");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    ConfirmStatusType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
