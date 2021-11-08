package com.dbSpring.Spring_Database.service;


import com.dbSpring.Spring_Database.repository.PeopleModel;
import com.dbSpring.Spring_Database.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> getAllPeople() {
        List<People> rv = new ArrayList<>();
        for (PeopleModel people: peopleRepository.findAll()) {
            rv.add(new People(people));
        }
        return rv;
    }

    @Override
    public void addPeople(PeopleModel people) {
        peopleRepository.save(people);
    }


}
