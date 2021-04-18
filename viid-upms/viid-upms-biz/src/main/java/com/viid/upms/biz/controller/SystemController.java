package com.viid.upms.biz.controller;

import com.viid.common.base.R;
import com.viid.common.exception.SystemNotFoundException;
import com.viid.upms.api.entity.System;
import com.viid.upms.biz.service.SystemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * SystemController
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/

@RestController
@RequestMapping(value = "/api/system")
public class SystemController {

    private final SystemService systemService;

    public SystemController(SystemService systemService) {
        this.systemService = systemService;
    }


    /**
     * 查询系统列表
     * @return R<List<System>>
     */
    @GetMapping(value = "/")
    public R<List<System>> getSystemList(){
        List<System> systems = systemService.list();
        return R.ok(systems);
    }


    /**
     * 根据系统id查询系统
     * @param deviceId 系统公安机构id
     * @return R<System>
     */
    @GetMapping(value = "/deviceId/{deviceId}")
    public R<System> getSystemByDeviceId(@PathVariable String deviceId){
        System system = systemService.getByDeviceId(deviceId);
        if(Objects.nonNull(system)){
            return R.ok(system);
        }else {
            return R.failed("get system by deviceId failed,deviceId:"+deviceId);
        }
    }


    /**
     * 根据系统id查询系统
     * @param id 系统id
     * @return R<System>
     */
    @GetMapping(value = "/{id}")
    public R<System> getSystem(@PathVariable Long id){
        System system = systemService.getById(id);
        if(Objects.nonNull(system)){
            return R.ok(system);
        }else {
            throw new SystemNotFoundException();
        }
    }

    /**
     * 新增系统
     * @param system 系统对象
     * @return R<System>
     */
    @PostMapping(value = "/")
    public R<System> addSystem(@RequestBody System system){
        boolean saveResult = systemService.save(system);
        if(saveResult){
            return R.ok(system);
        }else {
            return R.failed("add system failed");
        }
    }


    /**
     * 根据id删除系统
     * @param id 系统id
     * @return R<System>
     */
    @DeleteMapping(value = "/{id}")
    public R<System> deleteSystem(@PathVariable Long id){
        System system = systemService.getById(id);
        if(Objects.nonNull(system)){
            boolean deleteResult = systemService.removeById(id);
            if(deleteResult){
                return R.ok(system);
            }
            return R.failed("system id:"+id+" delete failed");
        }else {
            throw new SystemNotFoundException();
        }
    }
}
