package com.licit.licitApp.controller;

import com.licit.licitApp.controller.DTO.SaveLicitDTO;
import com.licit.licitApp.services.LicitService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class LicitController {

    private final LicitService licitService;

    public LicitController(LicitService licitService) {
        this.licitService = licitService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveNewLicit(@RequestBody @Valid SaveLicitDTO saveLicitDTO){
        licitService.saveNewLicit(saveLicitDTO.toLicitDTO());
    }

}
