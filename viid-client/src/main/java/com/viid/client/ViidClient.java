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

package com.viid.client;

import com.viid.client.config.ViidClientProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author qian.he
 * @version 0.1.0
 * @date 2021-04-09 00:00
 * @since 0.1.0
 **/

@Slf4j
public class ViidClient implements InitializingBean , DisposableBean {

    private final ViidClientProperties viidClientProperties;


    public ViidClient(ViidClientProperties viidClientProperties) {
        this.viidClientProperties = viidClientProperties;
    }

    @Override
    public void destroy() throws Exception {
        if(log.isDebugEnabled()){
            log.debug("viid client create,:{}",viidClientProperties);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if(log.isDebugEnabled()){
            log.debug("viid client destroy,:{}",viidClientProperties);
        }
    }
}
