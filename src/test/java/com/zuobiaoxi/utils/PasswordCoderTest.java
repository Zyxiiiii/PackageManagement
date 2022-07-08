package com.zuobiaoxi.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * PasswordCoder test
 *
 * @author zuobiaoxi
 * @since 2022/7/8 13:09
 */
public class PasswordCoderTest {
    @Test
    public void codeTest(){
        String encode1 = PasswordCoder.encode("123456");
        String encode2 = PasswordCoder.encode("abcdef");

        Assertions.assertTrue(PasswordCoder.compare("123456", encode1));
        Assertions.assertTrue(PasswordCoder.compare("abcdef", encode2));

        Assertions.assertFalse(PasswordCoder.compare("12345", encode1));
        Assertions.assertFalse(PasswordCoder.compare("abcde", encode2));
    }
}
