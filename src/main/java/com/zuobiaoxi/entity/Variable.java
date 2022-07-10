package com.zuobiaoxi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zuobiaoxi._enum.AccessLevel;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Variable)实体类
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:38
 */
@Data
@Component
public class Variable implements Serializable {
    private static final long serialVersionUID = -62293747582502812L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String belongClass;

    @JsonProperty
    private AccessLevel accessLevel;

    @JsonProperty
    private Boolean isStatic;

    @JsonProperty
    private Boolean isFinal;

    @JsonProperty
    private String dataType;

    @JsonProperty
    private String comment;

}

