package com.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
    public static void main(String args[]) {
        //初始化容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通過getBean()獲取物件
//       Person person=(Person)ac.getBean("person");
        Person person = ac.getBean(Person.class);
        System.out.println(person);
    }
}
