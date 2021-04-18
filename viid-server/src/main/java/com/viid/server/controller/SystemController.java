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


import com.viid.upms.api.entity.System;
import com.viid.common.base.R;
import com.viid.common.enums.TimeCorrectModeType;
import com.viid.common.dto.ResponseStatusDTO;
import com.viid.common.dto.*;
import com.viid.server.config.ViidProperties;
import com.viid.upms.api.feign.SystemFeign;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.TimeZone;

import static com.viid.common.constant.ViidConstants.CONSUME_CONTENT_TYPE;

/**
 * SystemController
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/10
 * @since 0.1.0
 **/
@RestController
@RequestMapping(value = "VIID/System")
public class SystemController {


    private final ViidProperties viidProperties;

    private static final String DEVICE_ID="DeviceID";

    private final SystemFeign systemFeign;

    public SystemController(ViidProperties viidProperties, SystemFeign systemFeign) {
        this.viidProperties = viidProperties;
        this.systemFeign = systemFeign;
    }

    /**
     * 注册
     *
     * @param registerDTO Register
     * @return ResponseStatus
     */
    @PostMapping(value = "/Register", consumes = CONSUME_CONTENT_TYPE)
    public ResponseStatusDTO register(HttpServletRequest request,
                                      @Valid @RequestBody RegisterDTO registerDTO) {
        String requestUri = request.getRequestURI();
        R<System> systemResult = systemFeign.getSystemByDeviceId(registerDTO.getDeviceId());
        if(Objects.nonNull(systemResult) && systemResult.getCode()!=0){
            System system = System.builder()
                                    .deviceId(registerDTO.getDeviceId())
                                    .createTime(LocalDateTime.now())
                                    .updateTime(LocalDateTime.now())
                                    .build();
            systemFeign.addSystem(system);
        }
        request.getSession().setAttribute(DEVICE_ID, registerDTO.getDeviceId());
        return ResponseStatusDTO.ok(registerDTO.getDeviceId(), requestUri);
    }

    /**
     * 注销
     *
     * @param unRegisterDTO UnRegister
     * @return ResponseStatus
     */
    @PostMapping(value = "/UnRegister",consumes = CONSUME_CONTENT_TYPE)
    public ResponseStatusDTO unRegister(HttpServletRequest request,
                                        @Valid @RequestBody UnRegisterDTO unRegisterDTO) {
        String requestUri = request.getRequestURI();
        R<System> systemResult = systemFeign.getSystemByDeviceId(unRegisterDTO.getDeviceId());
        if(systemResult.getCode()==0){
            systemFeign.deleteSystem(systemResult.getData().getId());
        }
        return ResponseStatusDTO.ok(unRegisterDTO.getDeviceId(), requestUri);
    }

    /**
     * 保活
     *
     * @param keepAliveDTO KeepAlive
     * @return ResponseStatus
     */
    @PostMapping(value = "/Keepalive",consumes = CONSUME_CONTENT_TYPE)
    public ResponseStatusDTO register(HttpServletRequest request,
                                      @Valid @RequestBody KeepAliveDTO keepAliveDTO) {
        String requestUri = request.getRequestURI();
        R<System> systemResult = systemFeign.getSystemByDeviceId(keepAliveDTO.getDeviceId());
        if(systemResult.getCode()==0){
            return ResponseStatusDTO.ok(keepAliveDTO.getDeviceId(), requestUri);
        }
        return ResponseStatusDTO.builder()
                .statusCode(-1)
                .statusString("not register")
                .requestUrl(requestUri)
                .localTime(LocalDateTime.now())
                .build();
    }

    /**
     * 校时
     *
     * @return SystemTime
     */
    @GetMapping(value = "/Time")
    public SystemTimeDTO time() {
        return SystemTimeDTO.builder()
                .timeMode(TimeCorrectModeType.MANUAL)
                .localTime(LocalDateTime.now())
                .viidServerId(viidProperties.getServerId())
                .timeZone(TimeZone.getDefault().getID())
                .build();
    }
}
