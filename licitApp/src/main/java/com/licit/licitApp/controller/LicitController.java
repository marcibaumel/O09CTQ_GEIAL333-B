package com.licit.licitApp.controller;

import com.licit.licitApp.controller.dto.CreateLicitDto;
import com.licit.licitApp.controller.dto.LicitDto;
import com.licit.licitApp.service.LicitService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class LicitController {

    private final LicitService licitService;

    public LicitController(LicitService licitService) {
        this.licitService = licitService;
    }

    @PostMapping(path = "/newLicit", produces= MediaType.APPLICATION_JSON_VALUE)
    public LicitDto saveNewLicit(@RequestBody @Valid CreateLicitDto createLicitDto){
        return new LicitDto(licitService.saveNewLicit(createLicitDto.toLicit()));
    }

    @GetMapping("/findMaximum/{username}/{itemName}")
    public LicitDto findMaximumLicitByUserNameAndItemName(@PathVariable String username,@PathVariable String itemName){
        return new LicitDto(licitService.findMaximumLicitByUserNameAndItemName(username, itemName));
    }
}
