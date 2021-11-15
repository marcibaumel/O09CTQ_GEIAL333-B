package com.dbSpring.Spring_Database.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends PagingAndSortingRepository<PeopleModel, Long> {
    Iterable<PeopleModel> findAllByAgeGreaterThanEqual(int age);
}
