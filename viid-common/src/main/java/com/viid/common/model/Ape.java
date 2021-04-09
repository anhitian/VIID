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

package com.viid.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

/**
 * Ape
 * 采集设备对象
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/9
 * @since 0.1.0
 **/

@Data
@JsonRootName("APEObject")
public class Ape {

    /**
     * 设备ID
     *
     * @required
     * @mock 31000051511191250218
     * @since 0.1.0
     */
    @JsonProperty(value = "ApeID")
    private String apeId;


    /**
     * 车辆抓拍方向
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CapDirection")
    private Integer capDirection;


    /**
     * 功能类型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FunctionType")
    private String functionType;


    /**
     * IP地址
     *
     * @required
     * @mock 127.0.0.1
     * @since 0.1.0
     */
    @JsonProperty(value = "IPAddr")
    private String iPAddr;


    /**
     * IPv6地址
     *
     * @mock 127.0.0.1
     * @since 0.1.0
     */
    @JsonProperty(value = "IPV6Addr")
    private String iPV6Addr;


    /**
     * 是否在线
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsOnline")
    private String isOnline;


    /**
     * 纬度
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Latitude")
    private Double latitude;


    /**
     * 经度
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Longitude")
    private Double longitude;


    /**
     * 型号
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Model")
    private String model;


    /**
     * 监视区域说明
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "MonitorAreaDesc")
    private String monitorAreaDesc;


    /**
     * 监视方向
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "MonitorDirection")
    private String monitorDirection;


    /**
     * 名称
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Name")
    private String name;


    /**
     * 管辖单位代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "OrgCode")
    private String orgCode;


    /**
     * 所属采集系统
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "OwnerApsID")
    private String ownerApsID;


    /**
     * 口令
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Password")
    private String password;


    /**
     * 位置名
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Place")
    private String place;


    /**
     * 安装地点行政区划代码
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PlaceCode")
    private String placeCode;


    /**
     * 端口号
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Port")
    private String port;


    /**
     * 摄像机位置类型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PositionType")
    private String positionType;


    /**
     * 用户帐号
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "UserId")
    private String userId;

}
