package com.dbSpring.Spring_Database.controller;

import com.dbSpring.Spring_Database.service.People;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class PeopleCreateDto {
    @NotEmpty
    private String name;
    @Min(18)
    private int age;

    public PeopleCreateDto() {
    }

    public PeopleCreateDto(People people) {
        this.name = people.getName();
        this.age = people.getAge();
    }


    public String getName() {
        return name;
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

    public People toPeople(){
        return new People(null, age, name);
    }
}
