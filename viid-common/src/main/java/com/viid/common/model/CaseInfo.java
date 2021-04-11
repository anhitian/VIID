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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

/**
 * CaseInfo
 * 案事件信息对象
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/10
 * @since 0.1.0
 **/

@Data
@JsonRootName("CaseInfoObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseInfo {

    @JsonProperty(value = "CaseID")
    private String caseId;

    @JsonProperty(value = "CaseName")
    private String caseName;

    @JsonProperty(value = "CaseLinkMark")
    private String caseLinkMark;

    @JsonProperty(value = "CaseAbstract")
    private String caseAbstract;

    @JsonProperty(value = "ClueID")
    private String clueId;

    @JsonProperty(value = "TimeUpLimit")
    private String timeUpLimit;

    @JsonProperty(value = "TimeLowLimit")
    private String timeLowLimit;

    @JsonProperty(value = "CreateTime")
    private String createTime;

    @JsonProperty(value = "PlaceCode")
    private String placeCode;

    @JsonProperty(value = "PlaceFullAddress")
    private String placeFullAddress;

    @JsonProperty(value = "SuspectNumber")
    private Integer suspectNumber;

    @JsonProperty(value = "WitnessName")
    private String witnessName;

    @JsonProperty(value = "WitnessIDType")
    private String witnessIdType;

    @JsonProperty(value = "WitnessID")
    private String witnessId;

    @JsonProperty(value = "WitnessOrg")
    private String witnessOrg;

    @JsonProperty(value = "CreatorName")
    private String creatorName;

    @JsonProperty(value = "CreatorIDType")
    private String creatorIdType;

    @JsonProperty(value = "CreatorID")
    private String creatorId;

    @JsonProperty(value = "CreatorOrg")
    private String creatorOrg;

    @JsonProperty(value = "Longitude")
    private Double longitude;

    @JsonProperty(value = "Latitude")
    private Double latitude;

    @JsonProperty(value = "EventIDs")
    private String eventIds;

    @JsonProperty(value = "MotorVehicleIDs")
    private String motorVehicleIds;

    @JsonProperty(value = "nonMotorVehicleIds")
    private String nonMotorVehicleIds;

    @JsonProperty(value = "PersonIDs")
    private String personIds;

    @JsonProperty(value = "FaceIDs")
    private String faceIds;

    @JsonProperty(value = "ThingIDs")
    private String thingIds;

    @JsonProperty(value = "FileIDs")
    private String fileIds;

    @JsonProperty(value = "SceneIDs")
    private String sceneIds;

    @JsonProperty(value = "RelateCaseIdList")
    private String relateCaseIdList;

    @JsonProperty(value = "ParentCaseId")
    private String parentCaseId;

    @JsonProperty(value = "State")
    private Integer state;
}
