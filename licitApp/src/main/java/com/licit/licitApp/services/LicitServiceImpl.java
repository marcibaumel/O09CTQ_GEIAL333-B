package com.licit.licitApp.services;

import com.licit.licitApp.domain.LicitModel;
import com.licit.licitApp.repository.LicitRepository;
import com.licit.licitApp.services.DTO.LicitDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicitServiceImpl implements  LicitService{

    private final LicitRepository licitRepository;

    public LicitServiceImpl(LicitRepository licitRepository) {
        this.licitRepository = licitRepository;
    }

    @Override
    public void saveNewLicit(LicitDTO licitDTO) {
        licitRepository.save(licitDTO.toEntityLicitModel());
    }
}
