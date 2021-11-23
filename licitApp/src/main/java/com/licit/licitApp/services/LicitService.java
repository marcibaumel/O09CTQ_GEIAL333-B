package com.licit.licitApp.services;

import com.licit.licitApp.services.DTO.LicitDTO;
import org.springframework.stereotype.Service;

public interface LicitService {
    int actualHighestLicit();
    //int actualHighestLicitByUser(int userId);
    void saveNewLicit(LicitDTO licitDTO);
}
