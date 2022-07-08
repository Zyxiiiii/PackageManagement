package com.zuobiaoxi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zuobiaoxi._enum.AccessLevel;
import lombok.Data;

import java.io.Serializable;

/**
 * (Method)实体类
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:37
 */
@Data
public class Method implements Serializable {
    private static final long serialVersionUID = -66759213984811876L;

    @JsonProperty
    private String id;

    @JsonProperty
    private Class belongClass;

    @JsonProperty
    private AccessLevel accessLevel;

    @JsonProperty
    private Boolean isStatic;

    @JsonProperty
    private Boolean isFinal;

    @JsonProperty
    private String returnValue;

    @JsonProperty
    private String methodName;

    @JsonProperty
    private String argList;

    @JsonProperty
    private String comment;
}

