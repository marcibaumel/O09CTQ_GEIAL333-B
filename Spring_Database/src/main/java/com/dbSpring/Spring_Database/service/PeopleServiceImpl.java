package com.dbSpring.Spring_Database.service;

import com.dbSpring.Spring_Database.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> getAllPeople() {
        /*
        List<People> rv = new ArrayList<>();
        for( hu.me.iit.webalk.db.repository.People people : peopleRepository.findAll()){
            rv.add(new People(people));
        }
        return rv;
         */

        return StreamSupport.stream(peopleRepository.findAll().spliterator(), false)
                .map(People::new)
                .collect(Collectors.toList());

    }

    @Override
    public People create(People people) {
        return new People(peopleRepository.save(people.toEntity()));
    }

    @Override
    public void deleteById(Long id) {
        peopleRepository.deleteById(id);
    }
}
