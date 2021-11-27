package com.licit.licitApp.service;

import com.licit.licitApp.service.dto.Licit;

public interface LicitService {
    Licit saveNewLicit(Licit licit);
    Licit findMaximumLicitByUserNameAndItemName(String username, String itemName);
}
