package com.spring.ioc.life;

public class Person {

    private Integer id;

    private String name;

    private String sex;

    public void init() {
        System.out.println("Three:初始化");
    }

    @Override
    public String toString() {
        return "Four:使用";
    }

    public void destroy() {
        System.out.println("Five:銷毀");
    }

    public Person() {
        System.out.println("One:實體創建");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("Two:依賴注入");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
