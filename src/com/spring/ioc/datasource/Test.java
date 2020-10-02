package com.spring.ioc.datasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("datasource.xml");
        DriverManagerDataSource bean = ac.getBean("datasource", DriverManagerDataSource.class);
        System.out.println(bean.getConnection());
    }
}
