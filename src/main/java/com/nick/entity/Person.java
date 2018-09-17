package com.nick.entity;

/**
 *
 * Created by Nick on 2018/9/17.
 */
public class Person {

    private String userName;

    private Integer age;

    public Person() {
        super();
    }

    public Person(String userName, Integer age) {
        super();
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
