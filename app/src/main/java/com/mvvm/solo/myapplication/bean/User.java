package com.mvvm.solo.myapplication.bean;

/**
 * 创建日期：2018/10/18 0018 on 14:07
 * 描述:
 * 作者:SoLo
 */
public class User {
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
