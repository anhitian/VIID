package com.viid.upms.biz.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.viid.upms.api.entity.System;
import com.viid.upms.biz.mapper.SystemMapper;
import com.viid.upms.biz.service.SystemService;
import org.springframework.stereotype.Service;

/**
 * SystemServiceImpl
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/
@Service
public class SystemServiceImpl extends ServiceImpl<SystemMapper, System> implements SystemService {


    @Override
    public System getByDeviceId(String deviceId) {
        return this.getBaseMapper().selectOne(Wrappers.<System>lambdaQuery().eq(System::getDeviceId, deviceId));
    }
}
