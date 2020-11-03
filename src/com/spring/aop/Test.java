package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        MathI math = ac.getBean("mathImpl", MathI.class);
        System.out.println(math.add(5, 1));

//        TestHandler bean = ac.getBean("testHandler", TestHandler.class);
//        bean.test();
    }
}
