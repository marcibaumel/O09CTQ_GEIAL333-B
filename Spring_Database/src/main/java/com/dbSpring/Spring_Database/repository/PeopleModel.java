package com.dbSpring.Spring_Database.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PeopleModel {
    @Id
    @GeneratedValue
    private Long id;

    private int age;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeopleModel() {
    }

    /*
    public People(hu.me.iit.webalk.db.service.People people) {
        this.age = people.getAge();
        this.name = people.getName();
    }
     */

    public PeopleModel(Long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
