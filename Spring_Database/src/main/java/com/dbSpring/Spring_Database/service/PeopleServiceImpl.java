package com.dbSpring.Spring_Database.service;

import com.dbSpring.Spring_Database.exception.NoSuchEntity;
import com.dbSpring.Spring_Database.repository.PeopleModel;
import com.dbSpring.Spring_Database.repository.PeopleRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

        return StreamSupport.stream(peopleRepository.findAll().spliterator(), false)
                .map(People::new)
                .collect(Collectors.toList());

    }

    public Iterable<People> getAllPeople2(){
        List<People> rv = new ArrayList<>();
        for( PeopleModel people : peopleRepository.findAll()){
            rv.add(new People(people));
        }
        return rv;
    }

    @Override
    public People create(People people) {
        return new People(peopleRepository.save(people.toEntity()));
    }

    @Override
    public void deleteById(Long id) {
        try{
            peopleRepository.deleteById(id);
        }catch (EmptyResultDataAccessException ex){
            throw new NoSuchEntity(id);
        }

    }

    @Override
    public People getById(Long id) {
        Optional<PeopleModel> peopleModel = peopleRepository.findById(id);
        if(peopleModel.isEmpty()){
            throw new NoSuchEntity(id);
        }
        return new People(peopleModel.get());
        //return new People(peopleRepository.findById(id).orElse());
    }

    @Override
    public void save(People people) {
        Optional<PeopleModel> peopleModel = peopleRepository.findById(people.getId());
        if(peopleModel.isEmpty()){
            throw new NoSuchEntity(people.getId());
        }
        peopleRepository.save(people.toEntity());
    }

    /*
    @Override
    public Iterable<? extends People> findAgeOrGrater(int age) {
        List<People> rv = new ArrayList<>();
        for( PeopleModel people :  peopleRepository.findAllByAgeGreaterThanEquals(age)){
            rv.add(new People(people));
        }
        return rv;
    }

     */

}
