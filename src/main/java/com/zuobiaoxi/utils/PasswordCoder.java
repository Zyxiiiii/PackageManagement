package com.zuobiaoxi.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zuobiaoxi
 */
public class PasswordCoder {
    private static final String SALT = "reality_zuobiaoxi";
    private static MessageDigest md5;

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public PasswordCoder(){}

    public static String encode(String password) {
        byte[] digest = md5.digest((password + SALT).getBytes());
        md5.reset();
        return new String(digest);
    }

    public static boolean compare(String cleartext, String privateKey) {
        byte[] digest = md5.digest((cleartext + SALT).getBytes());
        md5.reset();
        return privateKey.equals(new String(digest));
    }
}
