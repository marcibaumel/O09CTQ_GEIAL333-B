package com.licit.licitApp.repository;

import com.licit.licitApp.domain.LicitModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LicitRepository extends PagingAndSortingRepository<LicitModel, Long> {
    @Query(value = "SELECT max(Licit) FROM LicitModel")
    Optional<LicitModel> findTopLicit();

    //Optional<LicitModel> findTopByLicitByUserId(Integer userId);
}
