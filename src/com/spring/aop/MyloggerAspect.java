package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect//標註當前類為切面
public class MyloggerAspect {

    /*
     * @Before:將方法指定為前置通知
     * 必須設置value，其值為切入點表達式
     * */
    @Before(value = "execution(public int com.spring.aop.MathImpl.add(int,int))")
    public void beforeMethod() {
        System.out.println("方法執行之前");
    }

}
