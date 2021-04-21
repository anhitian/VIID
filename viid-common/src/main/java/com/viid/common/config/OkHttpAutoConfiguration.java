package com.viid.common.config;

import com.viid.common.annotation.ApplicationInterceptor;
import com.viid.common.annotation.NetworkInterceptor;
import okhttp3.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * OkHttpAutoConfiguration
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/22
 * @since 0.1.0
 **/
@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(OkHttpClient.class)
@EnableConfigurationProperties(OkHttpProperties.class)
public class OkHttpAutoConfiguration {

    @Autowired
    private OkHttpProperties okHttpProperties;

    @Autowired
    private ObjectProvider<OkHttpConfigurer> configurers;

    @Autowired
    @ApplicationInterceptor
    private ObjectProvider<Interceptor> applicationInterceptors;

    @Autowired
    @NetworkInterceptor
    private ObjectProvider<Interceptor> networkInterceptors;

    @Bean
    @ConditionalOnMissingBean
    public OkHttpClient okHttp3Client(
            ObjectProvider<Cache> cache,
            ObjectProvider<CookieJar> cookieJar,
            ObjectProvider<Dns> dns,
            ObjectProvider<X509TrustManager> trustManagerProvider,
            ConnectionPool connectionPool) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        cache.ifUnique(builder::cache);

        builder.connectTimeout(okHttpProperties.getConnectTimeout().toMillis(), TimeUnit.MILLISECONDS);
        builder.readTimeout(okHttpProperties.getReadTimeout().toMillis(), TimeUnit.MILLISECONDS);
        builder.writeTimeout(okHttpProperties.getWriteTimeout().toMillis(), TimeUnit.MILLISECONDS);
        builder.pingInterval(okHttpProperties.getPingInterval().toMillis(), TimeUnit.MILLISECONDS);

        cookieJar.ifUnique(builder::cookieJar);

        dns.ifUnique(builder::dns);

        builder.connectionPool(connectionPool);

        builder.followRedirects(okHttpProperties.isFollowSslRedirects());
        builder.followSslRedirects(okHttpProperties.isFollowSslRedirects());
        builder.retryOnConnectionFailure(okHttpProperties.isRetryOnConnectionFailure());

        applicationInterceptors.forEach(builder::addInterceptor);
        networkInterceptors.forEach(builder::addNetworkInterceptor);
        configurers.forEach(configurer -> configurer.configure(builder));
        //todo add ssl

        return builder.build();
    }

    @Bean
    @ConditionalOnMissingBean
    public ConnectionPool okHttp3ConnectionPool() {
        int maxIdleConnections = okHttpProperties.getConnectionPool().getMaxIdleConnections();
        Duration keepAliveDuration = okHttpProperties.getConnectionPool().getKeepAliveDuration();
        return new ConnectionPool(maxIdleConnections, keepAliveDuration.toMillis(), TimeUnit.MILLISECONDS);
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "okhttp.cache.enabled", havingValue = "true", matchIfMissing = true)
    public Cache okHttp3Cache() throws IOException {
        File directory = okHttpProperties.getCache().getDirectory();
        if (directory == null) {
            directory = Files.createTempDirectory("okhttp-cache").toFile();
        }
        return new Cache(directory, okHttpProperties.getCache().getMaxSize().toBytes());
    }
}