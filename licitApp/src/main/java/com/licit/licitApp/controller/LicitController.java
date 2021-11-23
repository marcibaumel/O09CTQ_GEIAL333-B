package com.licit.licitApp.controller;

import com.licit.licitApp.services.LicitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicitController {

    private final LicitService licitService;

    public LicitController(LicitService licitService) {
        this.licitService = licitService;
    }

    @GetMapping("/highest_licit")
    public int getActualHighestLicit(){
        return licitService.actualHighestLicit();
    }

    @GetMapping("/licit/highest/{user}")
    public int getActualHighestLicitByUser(@PathVariable("user") int userId){
        return licitService.actualHighestLicitByUser(userId);
    }

}
