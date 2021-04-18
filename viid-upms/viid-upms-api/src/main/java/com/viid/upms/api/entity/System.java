package com.viid.upms.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * System
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/18
 * @since 0.1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class System {

    private Long id;

    private String deviceId;

    private String name;



    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
