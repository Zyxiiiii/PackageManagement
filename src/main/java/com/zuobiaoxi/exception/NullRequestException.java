package com.zuobiaoxi.exception;

/**
 * @author zuobiaoxi
 */
public class NullRequestException extends RuntimeException {

    public NullRequestException() {
        super("请求参数映射失败，所需要的请求为空");
    }

    public NullRequestException(String message){
        super(message);
    }

    public NullRequestException(String message, Throwable cause){
        super(message, cause);
    }

    public NullRequestException(Throwable cause){
        super(cause);
    }
}
