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
 * PropertyType
 * 布控对象名称中属性类型
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum PropertyType {


    /**
     * 序号	消息中取值	说明
     * 1	1	人名
     * 2	2	证件号码
     * 3	3	车牌
     * 4	4	车牌颜色
     * 5	5	车辆品牌
     * 6	6	车辆型号
     * 7	7	车辆年款
     * 8	8	关键字
     */

    PERSON_NAME(1, "人名"),
    ID_NUMBER(2, "证件号码"),
    LICENSE_PLATE(3, "车牌"),
    LICENSE_PLATE_COLOR(4, "车牌颜色"),
    VEHICLE_BRANDS(5, "车辆品牌"),
    VEHICLE_MODEL(6, "车辆型号"),
    VEHICLE_YEAR(7, "车辆年款"),
    KEYWORD(8, "关键字");


    @JsonValue
    @EnumValue
    private final Integer code;

    private final String desc;

    PropertyType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
