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

package com.viid.server.controller;

import com.viid.common.dto.FaceDTO;
import com.viid.common.dto.FaceListDTO;
import com.viid.common.dto.ResponseStatusDTO;
import com.viid.common.dto.ResponseStatusListDTO;
import org.springframework.web.bind.annotation.*;

/**
 * FaceController
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/14
 * @since 0.1.0
 **/
@RestController
@RequestMapping(value = "VIID/Faces")
public class FaceController {

    /**
     * 单个人脸查询
     * @param faceId 人脸id
     * @return Face
     */
    @GetMapping(value = "/{faceId}")
    public FaceDTO getFace(@PathVariable String faceId){
        return new FaceDTO();
    }


    /**
     * 单个人脸修改
     * @param faceId 人脸id
     * @return Face
     */
    @PutMapping(value = "/{faceId}")
    public ResponseStatusDTO updateFace(@PathVariable String faceId){
        return new ResponseStatusDTO();
    }


    /**
     * 单个人脸修改
     * @param faceId 人脸id
     * @return Face
     */
    @DeleteMapping(value = "/{faceId}")
    public ResponseStatusDTO deleteFace(@PathVariable String faceId){
        return new ResponseStatusDTO();
    }


    /**
     * 人脸批量查询
     *
     * @return FaceList
     */
    @GetMapping(value = "/")
    public FaceListDTO getFaces(){
        return new FaceListDTO();
    }


    /**
     * 人脸批量删除
     *
     * @return FaceList
     */
    @DeleteMapping(value = "/")
    public ResponseStatusListDTO deleteFaces(){
        return new ResponseStatusListDTO();
    }

    /**
     * 人脸批量新增
     *
     * @return FaceList
     */
    @PostMapping(value = "/")
    public ResponseStatusListDTO addFaces(){
        return new ResponseStatusListDTO();
    }

}
