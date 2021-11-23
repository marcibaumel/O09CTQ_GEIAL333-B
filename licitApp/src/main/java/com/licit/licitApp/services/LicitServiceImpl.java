package com.licit.licitApp.services;

import com.licit.licitApp.repository.LicitRepository;
import com.licit.licitApp.services.DTO.LicitDTO;
import org.springframework.stereotype.Service;

@Service
public class LicitServiceImpl implements  LicitService{

    private final LicitRepository licitRepository;

    public LicitServiceImpl(LicitRepository licitRepository) {
        this.licitRepository = licitRepository;
    }


    @Override
    public int actualHighestLicit() {
       
    }

    @Override
    public int actualHighestLicitByUser(int userId) {
        return 0;
    }

    @Override
    public void saveNewLicit(LicitDTO licitDTO) {

    }
}
