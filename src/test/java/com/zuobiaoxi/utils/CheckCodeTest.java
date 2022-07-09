package com.zuobiaoxi.utils;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class CheckCodeTest {

    @Test
    public void checkCodeTest() throws IOException {
        System.out.println(CheckCodeUtil.outputVerifyImage(300, 100, new File("src/test/resources/CheckCodeTest1.jpg"), 4));
        System.out.println(CheckCodeUtil.outputVerifyImage(300, 100, new File("src/test/resources/CheckCodeTest2.jpg"), 4));
        System.out.println(CheckCodeUtil.outputVerifyImage(300, 100, new File("src/test/resources/CheckCodeTest3.jpg"), 4));
        System.out.println(CheckCodeUtil.outputVerifyImage(300, 100, new File("src/test/resources/CheckCodeTest4.jpg"), 4));
    }
}
