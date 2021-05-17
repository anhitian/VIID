package com.viid.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.viid.upms.api.entity.System;
import org.springframework.stereotype.Component;

/**
 * SystemService
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/
public interface SystemService extends IService<System> {

    /**
     * 根据系统国标id查询系统
     * @param deviceId 系统国标id
     * @return System
     */
    System getByDeviceId(String deviceId);
}
