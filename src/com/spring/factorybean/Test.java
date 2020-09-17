package com.spring.factorybean;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("factory-bean");
        Object object=ac.getBean("factory");
        System.out.println(object);
    }
}
