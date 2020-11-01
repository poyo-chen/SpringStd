package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
    private Object object;

    public ProxyUtil(Object object) {
        this.object = object;
    }

    public Object getProxy() {
        //獲取當前類的類加載器，用來加載代理對象所屬類
        ClassLoader loader = this.getClass().getClassLoader();
        //獲取目標對象實現的所有街口的class，代理類會和目標類實現相同的街口，最終通過代理對象實現功能
        Class[] interfaces = object.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            //代理對象實現功能的方式
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    MyLogger.before(method.getName(), Arrays.toString(args));
                    Object result = method.invoke(object, args);//動態代理對象實現功能
                    MyLogger.after(method.getName(), result);
                    return result;
                } catch (Exception e) {
                    MyLogger.throwing();
                    e.printStackTrace();
                }
                return null;
            }
        });
    }
}
