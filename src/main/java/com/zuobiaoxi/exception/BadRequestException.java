package com.zuobiaoxi.exception;

/**
 * @author zuobiaoxi
 */
public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("请求失败，所需要的请求有错误");
    }

    public BadRequestException(String message){
        super(message);
    }

    public BadRequestException(String message, Throwable cause){
        super(message, cause);
    }

    public BadRequestException(Throwable cause){
        super(cause);
    }
}