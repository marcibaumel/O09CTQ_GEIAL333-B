package com.dbSpring.Spring_Database;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
