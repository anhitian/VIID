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

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Face
 * 人脸对象
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-08 02:58
 * @since 0.1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("FaceObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDTO {

    /**
     * 人脸标示
     *
     * @required
     * @mock 130425101122290000019920181025105000222120600052
     * @since 0.1.0
     */
    @JsonProperty(value = "FaceID")
    private String faceId;

    /**
     * 信息分类
     *
     * @required
     * @mock 1
     * @since 0.1.0
     */
    @JsonProperty(value = "InfoKind", required = true)
    private String infoKind;

    /**
     * 来源标识
     *
     * @mock 31000051511191250101992018111910500022216
     * @since 0.1.0
     */
    @JsonProperty(value = "SourceID")
    private String sourceId;

    /**
     * 拍摄时间
     *
     * @mock 20181030105900
     * @since 0.1.0
     */
    @JsonProperty(value = "ShotTime")
    private LocalDateTime shotTime;

    /**
     * 设备编码
     *
     * @mock 31000051511191250101
     * @since 0.1.0
     */
    @JsonProperty(value = "DeviceID")
    private String deviceId;

    /**
     * 左上角X坐标
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "LeftTopX")
    private Integer leftTopX;

    /**
     * 左上角Y坐标
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "LeftTopY")
    private Integer leftTopY;

    /**
     * 右下角X坐标
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "RightBtmX")
    private Integer rightBtmX;

    /**
     * 右下角Y坐标
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "RightBtmY")
    private Integer rightBtmY;

    /**
     * 置标记时间
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "LocationMarkTime")
    private Date locationMarkTime;

    /**
     * 人脸出现时间
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FaceAppearTime")
    private Date faceAppearTime;

    /**
     * 人脸消失时间
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FaceDisAppearTime")
    private Date faceDisappearTime;

    /**
     * 证件种类
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IDType")
    private String idType;

    /**
     * 证件号码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IDNumber")
    private String idNumber;

    /**
     * 姓名
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * 曾用名
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "UsedName")
    private String usedName;

    /**
     * 绰号
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Alias")
    private String alias;

    /**
     * 性别代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "GenderCode")
    private String genderCode;

    /**
     * 年龄上限
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "AgeUpLimit")
    private Integer ageUpLimit;

    /**
     * 年龄下限
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "AgeLowerLimit")
    private Integer ageLowerLimit;

    /**
     * 民族代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "EthicCode")
    private String ethicCode;

    /**
     * 国籍代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "NationalityCode")
    private String nationalityCode;

    /**
     * 籍贯省市县代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "NativeCityCode")
    private String nativeCityCode;

    /**
     * 居住地行政区划
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ResidenceAdminDivision")
    private String residenceAdminDivision;

    /**
     * 汉语口音代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ChineseAccentCode")
    private String chineseAccentCode;


    /**
     * 职业类别代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "JobCategory")
    private String jobCategory;


    /**
     * 同行人数
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "AccompanyNumber")
    private Integer accompanyNumber;


    /**
     * 肤色
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "SkinColor")
    private String skinColor;


    /**
     * 居住地行政区划
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "HairStyle")
    private String hairStyle;


    /**
     * 发色
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "HairColor")
    private String hairColor;


    /**
     * 脸型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FaceStyle")
    private String faceStyle;


    /**
     * 脸部特征
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FacialFeature")
    private String facialFeature;


    /**
     * 体貌特征
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PhysicalFeature")
    private String physicalFeature;


    /**
     * 口罩颜色
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "RespiratorColor")
    private String respiratorColor;

    /**
     * 帽子颜色
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CapColor")
    private String capColor;

    /**
     * 帽子款式
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CapStyle")
    private String capStyle;


    /**
     * 眼镜颜色
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "GlassColor")
    private String glassColor;

    /**
     * 眼镜款式
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "GlassStyle")
    private String glassStyle;

    /**
     * 是否驾驶员
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsDriver")
    private Integer isDriver;

    /**
     * 是否涉外人员
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsForeigner")
    private Integer isForeigner;


    /**
     * 护照证件种类
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "PassportType")
    private String passportType;

    /**
     * 出入境人员类别代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "ImmigrantTypeCode")
    private String immigrantTypeCode;


    /**
     * 是否涉恐人员
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsSuspectedTerrorist")
    private Integer isSuspectedTerrorist;


    /**
     * 涉恐人员编号
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "SuspectedTerroristNumber")
    private String suspectedTerroristNumber;

    /**
     * 是否涉案人员
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsCriminalInvolved")
    private Integer isCriminalInvolved;


    /**
     * 涉案人员专长代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CriminalInvolvedSpecilisationCode")
    private String criminalInvolvedSpecilisationCode;


    /**
     * 体表特殊标记
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "BodySpeciallMark")
    private String bodySpeciallMark;

    /**
     * 作案手段
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CrimeMethod")
    private String crimeMethod;

    /**
     * 作案特点代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CrimeCharacterCode")
    private String crimeCharacterCode;

    /**
     * 在逃人员编号
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "EscapedCriminalNumber")
    private String escapedCriminalNumber;

    /**
     * 是否在押人员
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsDetainees")
    private Integer isDetainees;

    /**
     * 看守所编码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "DetentionHouseCode")
    private String detentionHouseCode;

    /**
     * 在押人员身份
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "DetaineesIdentity")
    private String detaineesIdentity;

    /**
     * 在押人员特殊身份
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "DetaineesSpecialIdentity")
    private String detaineesSpecialIdentity;

    /**
     * 成员类型代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "MemberTypeCode")
    private String memberTypeCode;

    /**
     * 是否被害人
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsVictim")
    private Integer isVictim;


    /**
     * 被害人种类
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "VictimType")
    private String victimType;

    /**
     * 受伤害程度
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "InjuredDegree")
    private String InjuredDegree;

    /**
     * 尸体状况代码
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "CorpseConditionCode")
    private String corpseConditionCode;


    /**
     * 是否可疑人
     *
     * @required
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "IsSuspiciousPerson")
    private Integer isSuspiciousPerson;

    /**
     * 姿态分布
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Attitude")
    private Integer Attitude;


    /**
     * 相似度
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Similaritydegree")
    private Double similarityDegree;


    /**
     * 眉型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "EyebrowStyle")
    private String eyebrowStyle;

    /**
     * 鼻型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "NoseStyle")
    private String noseStyle;

    /**
     * 胡型
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "MustacheStyle")
    private String mustacheStyle;

    /**
     * 嘴唇
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "LipStyle")
    private String lipStyle;

    /**
     * 皱纹眼袋
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "WrinklePouch")
    private String wrinklePouch;

    /**
     * 痤疮色斑
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "AcneStain")
    private String acneStain;

    /**
     * 黑痣胎记
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FreckleBirthmark")
    private String freckleBirthmark;

    /**
     * 其他特征
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "OtherFeature")
    private String otherFeature;

    /**
     * 特征值列表
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FeatureList")
    private FeatureInfoListDTO featureList;


    /**
     * 图像列表
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "SubImageList")
    private SubImageInfoListDTO subImageList;


    /**
     * 归属分类标签标识
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "TabID")
    private String tabID;

}
