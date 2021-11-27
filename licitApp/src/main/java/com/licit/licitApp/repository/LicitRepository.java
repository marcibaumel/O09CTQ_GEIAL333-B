package com.licit.licitApp.repository;

import com.licit.licitApp.entity.Licit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LicitRepository extends JpaRepository<Licit, UUID> {
    List<Licit> findLicitsByUsernameAndItemName(String username, String itemName);
    Optional<Licit> findFirstByUsernameAndAndItemNameOrderByLicitMoneyDesc(String username, String itemName);
}
