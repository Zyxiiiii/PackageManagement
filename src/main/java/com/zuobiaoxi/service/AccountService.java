package com.zuobiaoxi.service;

import com.zuobiaoxi.request.AccountRequest;
import com.zuobiaoxi.response.LoginResponse;
import org.springframework.http.ResponseEntity;

import java.nio.file.AccessDeniedException;

/**
 * @author zuobiaoxi
 */
public interface AccountService {
    /**
     * the service to handle the login request
     *
     * @param accountRequest an vo to receive the account data
     * @throws AccessDeniedException if user don't have a right password, this exception will be thrown
     * @return the entity load response body
     */
    ResponseEntity<LoginResponse> login(AccountRequest accountRequest) throws AccessDeniedException;
}
