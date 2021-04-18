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

package com.viid.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CaseInfo
 * 案事件信息对象
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/10
 * @since 0.1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("CaseInfoObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseInfoDTO {

    /**
     * 案事件标识
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CaseID")
    private String caseId;

    /**
     * 案件名称
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CaseName")
    private String caseName;

    /**
     * 案件关联标识
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CaseLinkMark")
    private String caseLinkMark;

    /**
     * 案件类别
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CaseCategory")
    private String caseCategory;


    /**
     * 简要案情
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CaseAbstract")
    private String caseAbstract;

    /**
     * 线索标识
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ClueID")
    private String clueId;

    /**
     * 事发时间上限
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "TimeUpLimit")
    private String timeUpLimit;

    /**
     * 事发时间下限
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "TimeLowLimit")
    private String timeLowLimit;

    /**
     * 创建时间
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CreateTime")
    private String createTime;

    /**
     * 事发地点行政区划代码
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PlaceCode")
    private String placeCode;

    /**
     * 事发地点区划内详细地址
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PlaceFullAddress")
    private String placeFullAddress;

    /**
     * 可疑人数量
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "SuspectNumber")
    private Integer suspectNumber;

    /**
     * 发现人姓名
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "WitnessName")
    private String witnessName;

    /**
     * 发现人证件类型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "WitnessIDType")
    private String witnessIdType;

    /**
     * 发现人证件号码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "WitnessID")
    private String witnessId;

    /**
     * 发现人单位名称
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "WitnessOrg")
    private String witnessOrg;

    /**
     * 创建人姓名
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CreatorName")
    private String creatorName;

    /**
     * 创建人证件类型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CreatorIDType")
    private String creatorIdType;

    /**
     * 创建人证件号码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CreatorID")
    private String creatorId;

    /**
     * 创建人单位名称
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CreatorOrg")
    private String creatorOrg;

    /**
     * 事发地经度
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Longitude")
    private Double longitude;

    /**
     * 事发地纬度
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Latitude")
    private Double latitude;

    /**
     * 机动车标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "MotorVehicleIDs")
    private String motorVehicleIds;

    /**
     * 非机动车标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "nonMotorVehicleIds")
    private String nonMotorVehicleIds;

    /**
     * 人员标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PersonIDs")
    private String personIds;

    /**
     * 人脸标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FaceIDs")
    private String faceIds;

    /**
     * 物品标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ThingIDs")
    private String thingIds;

    /**
     * 文件标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FileIDs")
    private String fileIds;

    /**
     * 场景标识符
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "SceneIDs")
    private String sceneIds;

    /**
     * 相关案件标识
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "RelateCaseIdList")
    private String relateCaseIdList;

    /**
     * 父案件标识
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ParentCaseId")
    private String parentCaseId;

    /**
     * 案件状态
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "State")
    private Integer state;
}
