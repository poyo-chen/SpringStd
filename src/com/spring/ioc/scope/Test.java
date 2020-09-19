package com.spring.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*
        * 若spring中有singleton的bean，在容器初始化時創建此物件
        * 而prototype的bean，會在使用時創建
        */
        ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
        Student student1 = ac.getBean("student", Student.class);
        Student student2 = ac.getBean("student", Student.class);
        System.out.println(student1);
        System.out.println(student2);

    }
}
