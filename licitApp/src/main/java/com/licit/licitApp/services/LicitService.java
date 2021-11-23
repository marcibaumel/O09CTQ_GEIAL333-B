package com.licit.licitApp.services;

import org.springframework.stereotype.Service;

public interface LicitService {
    int actualHighestLicit();
    int actualHighestLicitByUser(int userId);
}
