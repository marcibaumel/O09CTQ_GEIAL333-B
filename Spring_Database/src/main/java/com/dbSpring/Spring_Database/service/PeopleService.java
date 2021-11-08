package com.dbSpring.Spring_Database.service;

public interface PeopleService {
    Iterable<People> getAllPeople();

    People create(People toPeople);

    void deleteById(Long id);
}
