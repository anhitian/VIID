package com.viid.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ViidClientProperties
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/19
 * @since 0.1.0
 **/
@Data
@ConfigurationProperties(prefix = "viid-client")
public class ViidClientProperties {

}
