package com.licit.licitApp.repository;

import com.licit.licitApp.domain.LicitModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LicitRepository extends JpaRepository<LicitModel, Long> {


}
