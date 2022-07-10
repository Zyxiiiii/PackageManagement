package com.zuobiaoxi.controller;

import com.zuobiaoxi.exception.BadRequestException;
import com.zuobiaoxi.exception.NullRequestException;
import com.zuobiaoxi.request.AccountRequest;
import com.zuobiaoxi.response.LoginResponse;
import com.zuobiaoxi.service.AccountService;
import com.zuobiaoxi.utils.CheckCodeUtil;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.Optional;

/**
 * @author zuobiaoxi
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @Resource
    private Logger logger;

    @GetMapping(value = "/checkCode", produces = "image/jpeg")
    public void checkCode(HttpServletResponse response) {
        try {
            CheckCodeUtil.outputVerifyImage(300, 100, response.getOutputStream(), 4);
        } catch (IOException e) {
            logger.error("an IOException was happen", e);
        }
    }

    @GetMapping(produces = "application/json;charset=UTF-8")
    public ResponseEntity<LoginResponse> login(AccountRequest accountRequest) throws AccessDeniedException {
        AccountRequest request = Optional.ofNullable(accountRequest).orElseThrow(NullRequestException::new);
        if (request.getUsername() == null || request.getPassword() == null) {
            throw new BadRequestException();
        }
        return accountService.login(accountRequest);
    }
}
