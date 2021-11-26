package com.licit.licitApp.repository;

import com.licit.licitApp.domain.Licit;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LicitRepository  extends PagingAndSortingRepository<Licit, UUID> {
}
