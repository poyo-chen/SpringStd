package com.spring.di;

public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private Double score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", teacher=" + teacher +
                '}';
    }

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student(Integer id, String name, Double score, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public Student(Integer id, String name, Integer age, String sex, Double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }
}
