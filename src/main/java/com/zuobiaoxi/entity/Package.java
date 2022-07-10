package com.zuobiaoxi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Package)实体类
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:37
 */
@Data
@Component
public class Package implements Serializable {
    private static final long serialVersionUID = 994158958553326863L;

    @JsonProperty
    private String id;

    @JsonProperty
    private Package packageName;

    @JsonProperty
    private Package parent;

    @JsonProperty
    private Package children;

    @JsonProperty
    private UserGroup manageGroup;
}

