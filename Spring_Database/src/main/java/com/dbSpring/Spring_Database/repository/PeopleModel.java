package com.dbSpring.Spring_Database.repository;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class PeopleModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Min(12)
    private int age;

    public PeopleModel(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public PeopleModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public PeopleModel toPeople(){
        return new PeopleModel(null,name, age);
    }
}
