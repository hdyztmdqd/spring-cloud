package com.example.webservice2.service;

public class VUser {
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "VUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
