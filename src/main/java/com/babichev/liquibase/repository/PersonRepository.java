package com.babichev.liquibase.repository;

import com.babichev.liquibase.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
