/*
 * Copyright (c) 2020 qian.he Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viid.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.DigestAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.DigestAuthenticationFilter;

/**
 * SecurityConfiguration
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/10
 * @since 0.1.0
 **/
@Order(1)
@Configuration
public class ViidSecurityConfiguration extends WebSecurityConfigurerAdapter {


    private final UserDetailsServiceImpl userDetailsService;

    private final ViidSecurityDigestProperties viidSecurityDigestProperties;

    public ViidSecurityConfiguration(UserDetailsServiceImpl userDetailsService,
                                     ViidSecurityDigestProperties viidSecurityDigestProperties) {
        this.userDetailsService = userDetailsService;
        this.viidSecurityDigestProperties = viidSecurityDigestProperties;
    }


    @Bean
    protected PasswordEncoder passwordEncoder() {
        return  new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {
                return rawPassword.toString();
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return rawPassword.toString().equals(encodedPassword);
            }
        };
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/VIID/System/Register", "/VIID/System/UnRegister").authenticated()
                .anyRequest().authenticated()
                .and()
                .addFilter(digestAuthenticationFilter())
                .exceptionHandling()
                .authenticationEntryPoint(digestEntryPoint())
                .and()
                .csrf().disable();
    }

    @Bean
    protected DigestAuthenticationFilter digestAuthenticationFilter() {
        DigestAuthenticationFilter digestAuthenticationFilter = new DigestAuthenticationFilter();
        digestAuthenticationFilter.setUserDetailsService(userDetailsService);
        digestAuthenticationFilter.setAuthenticationEntryPoint(digestEntryPoint());
        return digestAuthenticationFilter;
    }

    @Bean
    DigestAuthenticationEntryPoint digestEntryPoint() {
        DigestAuthenticationEntryPoint digestAuthenticationEntryPoint = new DigestAuthenticationEntryPoint();
        digestAuthenticationEntryPoint.setRealmName(viidSecurityDigestProperties.getRealmName());
        digestAuthenticationEntryPoint.setKey(viidSecurityDigestProperties.getKey());
        digestAuthenticationEntryPoint.setNonceValiditySeconds(viidSecurityDigestProperties.getNonceValiditySeconds());
        return digestAuthenticationEntryPoint;
    }

    @Override
    protected UserDetailsService userDetailsService() {
        return this.userDetailsService;
    }
}
