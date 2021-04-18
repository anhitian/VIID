package com.viid.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * ViidServerApplication
 *
 * @author qian.he
 */
@SpringBootApplication
@EnableFeignClients
public class ViidServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViidServerApplication.class, args);
    }
}
