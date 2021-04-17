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

import java.time.LocalDateTime;

/**
 * SubImageInfo
 * 子图像信息对象
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/9
 * @since 0.1.0
 **/

@Data
@JsonRootName("SubImageInfoObject")
public class SubImageInfo {

    /**
     * 图片base64数据
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Data")
    private String data;

    /**
     * 设备ID
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "DeviceID")
    private String deviceID;


    /**
     * 事件类型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "EventSort")
    private Integer eventSort;


    /**
     * 图片格式
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FileFormat")
    private String fileFormat;


    /**
     * 高
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Height")
    private Integer height;


    /**
     * 图片ID
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ImageID")
    private String imageID;


    /**
     * 快照时间
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ShotTime")
    private LocalDateTime shotTime;


    /**
     * 图片ID
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "StoragePath")
    private String storagePath;


    /**
     * 宽
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Width")
    private Integer width;

}
