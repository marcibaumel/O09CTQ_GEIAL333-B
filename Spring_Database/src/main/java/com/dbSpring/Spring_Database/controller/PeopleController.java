package com.dbSpring.Spring_Database.controller;


import com.dbSpring.Spring_Database.repository.PeopleModel;
import com.dbSpring.Spring_Database.service.People;
import com.dbSpring.Spring_Database.service.PeopleService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public Iterable<PeopleDTO> getAllPeople(){
        List <PeopleDTO> peopleDTOList = new ArrayList<>();
        for (People people:peopleService.getAllPeople()){
            peopleDTOList.add(new PeopleDTO(people));
        }
        return peopleDTOList;
    }

    @PostMapping("/{people}")
    public void save(@RequestBody PeopleCreateDTO model){
        peopleService.addPeople(toPeople(model));
    }

    public PeopleModel toPeople(PeopleCreateDTO peopleCreateDTO){
        return new PeopleModel(null, peopleCreateDTO.getName(), peopleCreateDTO.getAge());
    }
}
