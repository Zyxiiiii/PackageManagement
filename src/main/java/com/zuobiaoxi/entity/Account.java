package com.zuobiaoxi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author zuobiaoxi
 * @since 2022-07-08 09:51:36
 */
@Data
@Component
public class Account implements Serializable {
    private static final long serialVersionUID = 465909433722778286L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String username;

    @JsonProperty
    private String nickname;

    @JsonProperty
    private String password;

    @JsonProperty
    private UserGroup userGroup;
}

