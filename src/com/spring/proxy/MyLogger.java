package com.spring.proxy;

public class MyLogger {

    public static void before(String methodName, String args) {
        System.out.println("method:" + methodName + ",argument:" + args);
    }

    public static void after(String methodName, Object result) {
        System.out.println("method:" + methodName + ",argument:" + result);
    }

    public static void throwing() {
        System.out.println("有異常了!!");
    }
}
