package com.zuobiaoxi.utils;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author zuobiaoxi
 */
public class TokenBuilder {
    private static final String SIGNATURE = "$ay%fVV*GCZP1w5GuN7dAw%jaf&&kig%2mU";
    private static final Key KEY = Keys.hmacShaKeyFor(SIGNATURE.getBytes());

    private static final int EXP = 7 * 24 * 60 * 60 * 1000;

    private TokenBuilder() {
    }

    /**
     * create a jwt string
     *
     * @param userId the user id use to build body
     * @param username the username use to build body
     * @return the jwt string
     * */
    public static String createJwt(String userId, String username) {
        // build the jwt body
        Map<String, String> claim = new HashMap<>(3);
        claim.put("userId", userId);
        claim.put("username", userId);

        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setClaims(claim)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXP))
                .setSubject(username)
                .signWith(KEY)
                .compact();
    }

    /**
     * parse a Jwt string to map
     *
     *
     * */
    public static Map<String, Object> parseJwt(String source){
        Jws<Claims> claimsJws = Jwts.parserBuilder().setSigningKey(KEY).build().parseClaimsJws(source);
        return claimsJws.getBody();
    }
}
