package com.zuobiaoxi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * (UserGroup)实体类
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:38
 */
@Data
public class UserGroup implements Serializable {
    private static final long serialVersionUID = -46010368181396834L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String groupName;

    @JsonProperty
    private String privilege;
}

