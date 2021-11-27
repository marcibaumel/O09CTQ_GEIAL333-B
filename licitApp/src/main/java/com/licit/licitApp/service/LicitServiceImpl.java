package com.licit.licitApp.service;

import com.licit.licitApp.repository.LicitRepository;
import com.licit.licitApp.service.dto.Licit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LicitServiceImpl implements LicitService{
    private final LicitRepository licitRepository;

    public LicitServiceImpl(LicitRepository licitRepository) {
        this.licitRepository = licitRepository;
    }

    public Licit saveNewLicit(Licit licit){
        List<Licit> licitList = new ArrayList<>();
        for(com.licit.licitApp.entity.Licit entity : licitRepository.findLicitsByUsernameAndItemName(licit.getUsername(), licit.getItemName())){
            licitList.add(new Licit(entity));
        }
        if(licitList.isEmpty()){
            return new Licit(licitRepository.save(licit.toEntity()));
        }

        Licit highestLicit = new Licit();

        for(int i = 0; i< licitList.size(); i++){
            if(licitList.get(i).getLicitMoney() < licit.getLicitMoney()) {
                if(highestLicit.getLicitMoney() < licit.getLicitMoney())
                    highestLicit = licit;
            }
            else{
                highestLicit = licitList.get(i);
            }
        }

        if(!licitList.contains(highestLicit)){
            return new Licit(licitRepository.save(highestLicit.toEntity()));
        }

        return null;
    }

    @Override
    public Licit findMaximumLicitByUserNameAndItemName(String username, String itemName) {
        return new Licit(licitRepository.findFirstByUsernameAndAndItemNameOrderByLicitMoneyDesc(username,itemName));
    }

}
