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
 * Person
 * 人员对象
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
@JsonRootName("PersonObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {


    /**
     * 同行人数
     *
     * @mock 0
     * @since 0.1.0
     */
    @JsonProperty(value = "AccompanyNumber")
    private Integer accompanyNumber;


    /**
     * 年龄下限
     *
     * @mock 0
     * @since 0.1.0
     */
    @JsonProperty(value = "AgeLowerLimit")
    private Integer ageLowerLimit;


    /**
     * 年龄上限
     *
     * @mock 0
     * @since 0.1.0
     */
    @JsonProperty(value = "AgeUpLimit")
    private Integer ageUpLimit;


    /**
     * 绰号
     *
     * @mock 0
     * @since 0.1.0
     */
    @JsonProperty(value = "Alias")
    private String alias;
}
