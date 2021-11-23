package com.licit.licitApp.services;

import com.licit.licitApp.domain.LicitModel;
import com.licit.licitApp.services.DTO.LicitDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface LicitService {
    void saveNewLicit(LicitDTO licitDTO);
}
