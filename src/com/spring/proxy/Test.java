package com.spring.proxy;

public class Test {
    public static void main(String[] args) {
        /*MathI math = new MathImpl();
        int result = math.add(1, 1);
        System.out.println(result);
*/
        ProxyUtil proxyUtil = new ProxyUtil(new MathImpl());
        MathI mathI = (MathI) proxyUtil.getProxy();
        int i = mathI.div(4, 0);
        System.out.println(i);
    }
}
