package com.licit.licitApp.services;

import com.licit.licitApp.domain.LicitModel;
import com.licit.licitApp.repository.LicitRepository;
import com.licit.licitApp.services.DTO.LicitDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LicitServiceImpl implements  LicitService{

    private final LicitRepository licitRepository;

    public LicitServiceImpl(LicitRepository licitRepository) {
        this.licitRepository = licitRepository;
    }


    @Override
    public int actualHighestLicit() {
        Optional<LicitModel> licit = licitRepository.findTopLicit();
        if(licit.isEmpty()){
            return 0;
        }
       return licit.get().getLicit();
    }
/*
    @Override
    public int actualHighestLicitByUser(int userId) {
        Optional<LicitModel> licit = licitRepository.findTopByLicitByUserId(userId);
        if(licit.isEmpty()){
            return 0;
        }
        return licit.get().getLicit();
    }
*/
    @Override
    public void saveNewLicit(LicitDTO licitDTO) {
        licitRepository.save(licitDTO.toEntityLicitModel());
    }
}
