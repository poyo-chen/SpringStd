package com.spring.di;

import java.util.List;
import java.util.Map;

public class Teacher {

    private Integer tid;

    private String tname;

    private List<String> cls;

    private List<Student> studentList;

    private Map<String,String> bossMap;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", cls=" + cls +
                ", studentList=" + studentList +
                ", bossMap=" + bossMap +
                '}';
    }

    public Map<String, String> getBossMap() {
        return bossMap;
    }

    public void setBossMap(Map<String, String> bossMap) {
        this.bossMap = bossMap;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Teacher() {
    }

    public Teacher(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

}
