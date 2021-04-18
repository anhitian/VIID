package com.viid.common.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * R
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
public class R<T> implements Serializable {

    private int code;
    private String msg;
    private T data;

    public static <T> R<T> ok() {
        return R.<T>builder().code(0).msg("").build();
    }

    public static <T> R<T> ok(T data) {
        return R.<T>builder().code(0).msg("").data(data).build();
    }


    public static <T> R<T> failed(String msg) {
        return R.<T>builder().code(-1).msg(msg).build();
    }
}
