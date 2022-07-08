package com.zuobiaoxi._enum;

/**
 * @author zuobiaoxi
 */

public enum AccessLevel {

    /**
     * public level
     */
    PUBLIC("public"),

    /**
     * protect level
     */
    PROTECT("protect"),
    /**
     * default level
     */
    DEFAULT("default"),
    /**
     * private level
     */
    PRIVATE("private");
    private final String value;

    AccessLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
