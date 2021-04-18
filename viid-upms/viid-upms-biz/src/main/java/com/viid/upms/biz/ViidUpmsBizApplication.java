package com.viid.upms.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qian.he
 */
@MapperScan(basePackages = {"com.viid.upms.biz.mapper"})
@SpringCloudApplication
@EnableFeignClients
public class ViidUpmsBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViidUpmsBizApplication.class, args);
    }

}
