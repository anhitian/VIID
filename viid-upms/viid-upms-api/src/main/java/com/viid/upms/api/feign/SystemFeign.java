package com.viid.upms.api.feign;

import com.viid.common.base.R;
import com.viid.upms.api.feign.factory.SystemFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.viid.upms.api.entity.System;
import java.util.List;

/**
 * SystemService
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/
@FeignClient(value = "viid-upms-biz",fallbackFactory = SystemFeignFallbackFactory.class)
public interface SystemFeign {

    /**
     * 查询系统列表
     * @return R<List<System>>
     */
    @GetMapping(value = "/")
    R<List<System>> getSystemList();

    /**
     * 根据系统id查询系统
     * @param id 系统id
     * @return R<System>
     */
    @GetMapping(value = "/{id}")
    R<System> getSystem(@PathVariable Long id);


    /**
     * 根据系统id查询系统
     * @param deviceId 系统公安机构id
     * @return R<System>
     */
    @GetMapping(value = "/deviceId/{deviceId}")
    R<System> getSystemByDeviceId(@PathVariable String deviceId);

    /**
     * 新增系统
     * @param system 系统对象
     * @return R<System>
     */
    @PostMapping(value = "/")
    R<System> addSystem(@RequestBody System system);

    /**
     * 根据id删除系统
     * @param id 系统id
     * @return R<System>
     */
    @DeleteMapping(value = "/{id}")
    R<System> deleteSystem(@PathVariable Long id);
}
