package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect//標註當前類為切面
public class MyloggerAspect {

    /*
     * @Before:將方法指定為前置通知
     * 必須設置value，其值為切入點表達式
     * */
    //@Before(value = "execution(public int com.spring.aop.MathImpl.add(int,int))")
    @Before(value = "execution(* com.spring.aop.*.*(..))")//任意返回修飾  類  .. 任意參數
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();//獲取方法的參數
        String methodName = joinPoint.getSignature().getName();//獲取方法名
        System.out.println("method:" + methodName + ",arguments:" + Arrays.toString(args));
    }

    /*
     * @After:將方法指定為後置通知
     * 作用於方法的finally區塊，不管有沒有異常都會執行
     * */
    @After(value = "execution(* com.spring.aop.*.*(..))")
    public void afterMethod() {
        System.out.println("後置通知");
    }

    /*
     * @AfterReturning:將方法指定為返回通知
     * 作用於方法的執行之後區塊，有異常不會執行
     * 可藉由returning設置接收返回值的變量名
     * 要想在方法中使用，必續在方法的參數中設置和變量名相同的參數
     * */
    @AfterReturning(value = "execution(* com.spring.aop.*.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("返回通知 methodName:" + methodName + ", result" + result);
    }

    /*
     * @AfterThrowing:將方法指定為異常通知(例外通知)
     * 作用於方法拋出異常時
     * 可藉由throwing設置接收返回的異常訊息
     * 在參數列表中可通過具體的異常類型來隊指定的異常進行操作
     * */
    @AfterThrowing(value = "execution(* com.spring.aop.*.*(..))", throwing = "ex")
    public void afterThrowingMethod(Exception ex) {
        System.out.println("有異常了,message:" + ex);
    }

    @Around(value = "execution(* com.spring.aop.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        try {
            //前置通知
            System.out.println("around before");
            result = proceedingJoinPoint.proceed();//執行方法
            //返回通知
            System.out.println("around beforeReturning");
            return result;
        } catch (Throwable throwable) {
            //異常通知
            throwable.printStackTrace();
            System.out.println("around afterThrowing");
        } finally {
            //後置通知
            System.out.println("around after");
        }
        return -1;//null 不能給int
    }
}
