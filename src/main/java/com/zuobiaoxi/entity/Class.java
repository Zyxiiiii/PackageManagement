package com.zuobiaoxi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Class)实体类
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:37
 */
@Data
@Component
public class Class implements Serializable {
    private static final long serialVersionUID = -79169031371876383L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String accessLevel;

    @JsonProperty
    private Package belongPackage;

    @JsonProperty
    private String className;

    @JsonProperty
    private Class parent;

    @JsonProperty
    private Class comment;

}

