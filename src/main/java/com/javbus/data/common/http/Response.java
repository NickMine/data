package com.javbus.data.common.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 22:15
 * @Description:
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Response<T> {
    private Integer code = 200;
    private String message = "SUCCESS";
    private T data;

    public Response() {
    }

    public static Response success() {
        return new Response();
    }

    public static <T> Response success(T data) {
        Response<T> rtn = new Response<>();
        rtn.setData(data);
        return rtn;
    }

    public static <T> Response success(String message, T data) {
        Response<T> rtn = new Response<>();
        rtn.setData(data);
        rtn.setMessage(message);
        rtn.setData(data);
        return rtn;
    }

    public static Response fail(Integer code, String message) {
        Response rtn = new Response<>();
        rtn.setCode(code);
        rtn.setMessage(message);
        return rtn;
    }
}
