package com.gopeshdesai.springboot.repository;

import com.gopeshdesai.springboot.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

}