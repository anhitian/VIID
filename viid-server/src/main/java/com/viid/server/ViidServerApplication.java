package com.viid.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * ViidServerApplication
 *
 * @author qian.he
 */
@SpringCloudApplication
@EnableFeignClients(basePackages = {"com.viid.upms.api.feign"})
public class ViidServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViidServerApplication.class, args);
    }
}
