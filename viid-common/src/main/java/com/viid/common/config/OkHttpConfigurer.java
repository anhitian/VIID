package com.viid.common.config;

import okhttp3.OkHttpClient;

/**
 * OkHttpConfigurer
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/22
 * @since 0.1.0
 **/

@FunctionalInterface
public interface OkHttpConfigurer {

    /**
     * 自定义okhttp
     * @param builder
     */
    void configure(OkHttpClient.Builder builder);
}
