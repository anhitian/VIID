package com.viid.client.config;

/**
 * ViidClientConfigurationCustomizer
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/21
 * @since 0.1.0
 **/
public interface ViidClientConfigurationCustomizer {

    /**
     * 自定义
     * @param viidClientProperties
     */
    void customize(ViidClientProperties viidClientProperties);
}
