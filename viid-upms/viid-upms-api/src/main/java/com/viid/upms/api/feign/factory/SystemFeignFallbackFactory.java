package com.viid.upms.api.feign.factory;

import com.viid.upms.api.feign.SystemFeign;
import com.viid.upms.api.feign.fallback.SystemFeignFallback;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * SystemFeignClientFallbackFactory
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/
@Component
public class SystemFeignFallbackFactory implements FallbackFactory<SystemFeign> {

    @Override
    public SystemFeignFallback create(Throwable cause) {
        SystemFeignFallback systemFeignFallback=new SystemFeignFallback();
        systemFeignFallback.setCause(cause);
        return systemFeignFallback;
    }
}
