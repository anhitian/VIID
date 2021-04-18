package com.viid.upms.api.feign.fallback;

import com.viid.common.base.R;
import com.viid.upms.api.feign.SystemFeign;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import com.viid.upms.api.entity.System;
import java.util.List;

/**
 * SystemFeignClientFallback
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/
@Slf4j
public class SystemFeignFallback implements SystemFeign {

    @Setter
    private Throwable cause;

    @Override
    public R<List<System>> getSystemList() {
        log.error("get system list error",cause);
        return null;
    }

    @Override
    public R<System> getSystem(Long id) {
        log.error("get system by id error,id:{}",id,cause);
        return null;
    }

    @Override
    public R<System> getSystemByDeviceId(String deviceId) {
        log.error("get system by deviceId error,deviceId:{}",deviceId,cause);
        return null;
    }

    @Override
    public R<System> addSystem(System system) {
        log.error("add system error,system:{}",system,cause);
        return null;
    }

    @Override
    public R<System> deleteSystem(Long id) {
        log.error("delete system by id error,id:{}",id,cause);
        return null;
    }
}
