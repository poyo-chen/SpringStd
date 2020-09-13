package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
//        Student std=ac.getBean("s1",Student.class);
//        System.out.println(std);
//        Student std2=ac.getBean("s2",Student.class);
//        System.out.println(std2);
//        Student std3=ac.getBean("s3",Student.class);
//        System.out.println(std3);
//        Student std4=ac.getBean("s4",Student.class);
//        System.out.println(std4);
//        Student std5=ac.getBean("s5",Student.class);
//        System.out.println(std5);
//        Student std6=ac.getBean("s6",Student.class);
//        System.out.println(std6);

        for (int i = 1; i <= 6; i++) {
            Student std = ac.getBean("s" + i, Student.class);
            System.out.println(std);
        }

        for (int i = 1; i <= 3; i++) {
            Teacher teacher = ac.getBean("t" + i, Teacher.class);
            System.out.println(teacher);
        }
//        Teacher teacher2=ac.getBean("t2",Teacher.class);
//        System.out.println(teacher2);
    }
}
