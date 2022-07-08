package com.zuobiaoxi.utils;

import io.jsonwebtoken.security.SignatureException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Map;

/**
 * TokenBuilder test
 *
 * @author zuobiaoxi
 * @since 2022/7/8 12:51
 */
public class TokenBuilderTest {

    @Test
    public void JwtTest(){
        // 构造token
        String jwt1 = TokenBuilder.createJwt("user1", "user1");
        String jwt2 = TokenBuilder.createJwt("user2", "user2");
        String jwt3 = TokenBuilder.createJwt("user3", "user3");
        String jwt4 = TokenBuilder.createJwt("user4", "user4");
        String jwt5 = TokenBuilder.createJwt("user5", "user5");
        String jwt6 = TokenBuilder.createJwt("user6", "user6");

        System.out.println("==============token字符串==============");
        System.out.println(jwt1);
        System.out.println(jwt2);
        System.out.println(jwt3);
        System.out.println(jwt4);
        System.out.println(jwt5);
        System.out.println(jwt6);

        Map<String, Object> stringObjectMap1 = TokenBuilder.parseJwt(jwt1);
        Map<String, Object> stringObjectMap2 = TokenBuilder.parseJwt(jwt2);
        Map<String, Object> stringObjectMap3 = TokenBuilder.parseJwt(jwt3);
        Map<String, Object> stringObjectMap4 = TokenBuilder.parseJwt(jwt4);
        Map<String, Object> stringObjectMap5 = TokenBuilder.parseJwt(jwt5);
        Map<String, Object> stringObjectMap6 = TokenBuilder.parseJwt(jwt6);

        Assertions.assertEquals("user1", stringObjectMap1.get("userId"));
        Assertions.assertEquals("user1", stringObjectMap1.get("username"));

        Assertions.assertEquals("user2", stringObjectMap2.get("userId"));
        Assertions.assertEquals("user2", stringObjectMap2.get("username"));

        Assertions.assertEquals("user3", stringObjectMap3.get("userId"));
        Assertions.assertEquals("user3", stringObjectMap3.get("username"));

        Assertions.assertEquals("user4", stringObjectMap4.get("userId"));
        Assertions.assertEquals("user4", stringObjectMap4.get("username"));

        Assertions.assertEquals("user5", stringObjectMap5.get("userId"));
        Assertions.assertEquals("user5", stringObjectMap5.get("username"));

        Assertions.assertEquals("user6", stringObjectMap6.get("userId"));
        Assertions.assertEquals("user6", stringObjectMap6.get("username"));

        System.out.println("throw a expected exception: " + Assertions.assertThrowsExactly(SignatureException.class, () -> TokenBuilder.parseJwt(jwt1.substring(0, jwt1.length() - 4))).getMessage());
    }
}
