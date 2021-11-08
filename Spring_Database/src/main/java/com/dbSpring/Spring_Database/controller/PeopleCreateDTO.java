package com.dbSpring.Spring_Database.controller;

import com.dbSpring.Spring_Database.repository.PeopleModel;
import com.dbSpring.Spring_Database.service.People;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PeopleCreateDTO {

    @NotEmpty
    private String name;
    @Size(min = 18, max = 60)
    private int age;

    public PeopleCreateDTO() {
    }

    public PeopleCreateDTO(People people) {

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

    public PeopleCreateDTO(PeopleModel people){
        this.name = people.getName();
        this.age = people.getAge();
    }
}
