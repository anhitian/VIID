package com.viid.common.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * NetworkInterceptor
 * {@link Qualifier} annotation for {@link okhttp3.Interceptor OkHttp3-Interceptors}.
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/22
 * @since 0.1.0
 **/
@SuppressWarnings("WeakerAccess")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface NetworkInterceptor {
}
