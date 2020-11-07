package com.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class TestJdbcTemplate {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);

//        String sql = "insert into emp values(null,?,?,?)";
//        jdbcTemplate.update(sql,"李四",24,"女");

        String sql="insert into emp values(null,?,?,?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"a1",1,"boy"});
        list.add(new Object[]{"a2",2,"boy"});
        list.add(new Object[]{"a3",3,"boy"});
        jdbcTemplate.batchUpdate(sql,list);

    }
}
