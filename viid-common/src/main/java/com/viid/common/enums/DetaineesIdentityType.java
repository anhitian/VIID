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
 * DetaineesIdentityType
 * 在押人员身份
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum DetaineesIdentityType {

    /**
     * 序号	消息中取值	说明
     * 1	1	国家公务员
     * 2	2	企事业管理人员
     * 3	3	企事业职员
     * 4	4	工人
     * 5	5	农民
     * 6	6	个体工商业者
     * 7	7	在校学生
     * 8	8	离退休人员
     * 9	9	无业人员
     * 10	10	军人
     * 11	99	其他
     */
    CIVIL_SERVANTS("1", "国家公务员"),
    ENTERPRISE_MANAGEMENT_PERSONNEL("2", "企事业管理人员"),
    CORPORATE_STAFF("3", "企事业职员"),
    WORKER("4", "工人"),
    FARMER("5", "农民"),
    SELF_EMPLOYED("6", "个体工商业者"),
    SCHOOL_STUDENT("7", "在校学生"),
    RETIREES("8", "离退休人员"),
    UNEMPLOYED("9", "无业人员"),
    SOLDIER("10", "军人"),
    OTHER("99", "其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    DetaineesIdentityType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
