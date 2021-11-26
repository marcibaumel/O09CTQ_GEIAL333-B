package com.licit.licitApp.repository;

import com.licit.licitApp.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface UserRepository extends PagingAndSortingRepository<User, UUID> {
}
