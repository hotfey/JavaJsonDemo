package com.hotfey.pojo;

/**
 * Created by pipe on 2016/11/7.
 */
public class Staff {
    private String name;
    private Long num;
    private int age;
    private String address;
    private String cTime;
    private String lgTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getLgTime() {
        return lgTime;
    }

    public void setLgTime(String lgTime) {
        this.lgTime = lgTime;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", cTime='" + cTime + '\'' +
                ", lgTime='" + lgTime + '\'' +
                '}';
    }
}
