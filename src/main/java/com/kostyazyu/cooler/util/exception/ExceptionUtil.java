package com.kostyazyu.cooler.util.exception;


import com.kostyazyu.cooler.LoggerWrapper;

public class ExceptionUtil {
    private static final LoggerWrapper LOG = LoggerWrapper.get(ExceptionUtil.class);

    public static void check(boolean isFound, int id) {
        check(isFound, "id=" + id);
    }

    public static <T> T check(T object, int id) {
        return check(object, "id=" + id);
    }

    public static <T> T check(T object, String msg) {
        check(object != null, msg);
        return object;
    }

    public static void check(boolean isFound, String msg) {
        if (!isFound) throw LOG.getNotFoundException("Not found entity with " + msg);
    }
}
