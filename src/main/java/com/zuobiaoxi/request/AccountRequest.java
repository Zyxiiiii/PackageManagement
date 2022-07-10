package com.zuobiaoxi.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author zuobiaoxi
 */
@Component
@Data
public class AccountRequest {
    @JsonProperty
    private String username;

    @JsonProperty
    private String password;
}
