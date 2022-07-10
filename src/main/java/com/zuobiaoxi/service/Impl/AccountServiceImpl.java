package com.zuobiaoxi.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zuobiaoxi.dao.AccountDao;
import com.zuobiaoxi.entity.Account;
import com.zuobiaoxi.request.AccountRequest;
import com.zuobiaoxi.response.LoginResponse;
import com.zuobiaoxi.service.AccountService;
import com.zuobiaoxi.utils.PasswordCoder;
import com.zuobiaoxi.utils.TokenBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.file.AccessDeniedException;

/**
 * @author zuobiaoxi
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Resource
    private ObjectMapper objectMapper;

    /**
     * the service to handle the login request
     *
     * @param accountRequest an vo to receive the account data
     * @exception AccessDeniedException if user don't have a right password, this exception will be thrown
     * @return the entity load response body
     */
    @Override
    public ResponseEntity<LoginResponse> login(AccountRequest accountRequest) throws AccessDeniedException {
        Account account = accountDao.queryByUsername(accountRequest.getUsername());
        if (!PasswordCoder.compare(accountRequest.getPassword(), account.getPassword())) {
            throw new AccessDeniedException("登录校验失败，没有登陆权限！");
        }
        String jwt = TokenBuilder.createJwt(account.getUsername(), account.getId());

        return new ResponseEntity<LoginResponse>(new LoginResponse(jwt), HttpStatus.ACCEPTED);
    }
}
