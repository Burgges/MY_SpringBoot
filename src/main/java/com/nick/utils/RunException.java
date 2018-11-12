package com.nick.utils;

/**
 * 自定义运行时异常
 *
 * Created by Nick.Chen on 2018/10/31 0031.
 *
 */
public class RunException extends RuntimeException {

    private final transient Object[] parameters;

    public RunException(String message) {
        this(message, (Object[])null);
    }

    public RunException(String message, Object... parameters) {
        super(message);
        this.parameters = parameters;
    }

    public Object[] getParameters() {
        return this.parameters;
    }
}
