package com.dbSpring.Spring_Database.service;


import com.dbSpring.Spring_Database.repository.PeopleModel;

public interface PeopleService {
    Iterable<People> getAllPeople();
    void addPeople(PeopleModel people);
}
