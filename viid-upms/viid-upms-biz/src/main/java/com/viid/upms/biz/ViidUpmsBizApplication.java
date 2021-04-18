package com.viid.upms.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author qian.he
 */
@MapperScan(basePackages = {"com.viid.upms.biz.mapper"})
@SpringCloudApplication
public class ViidUpmsBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViidUpmsBizApplication.class, args);
    }

}
