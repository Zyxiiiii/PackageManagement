package com.zuobiaoxi.service;

import com.zuobiaoxi.request.AccountRequest;

import java.nio.file.AccessDeniedException;

/**
 * @author zuobiaoxi
 */
public interface AccountService {
    /**
     * the service to handle the login request
     *
     * @param accountRequest an vo to receive the account data
     * @return the json string of data
     */
    String login(AccountRequest accountRequest) throws AccessDeniedException;
}
