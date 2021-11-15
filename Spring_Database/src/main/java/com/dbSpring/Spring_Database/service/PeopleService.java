package com.dbSpring.Spring_Database.service;

public interface PeopleService {
    Iterable<People> getAllPeople();

    People create(People toPeople);

    void deleteById(Long id);

    People getById(Long id);

    void save(People people);

    //Iterable<? extends People> findAgeOrGrater(int age);
}
