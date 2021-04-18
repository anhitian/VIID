package com.viid.server.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FeignConfiguration
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/19
 * @since 0.1.0
 **/
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
