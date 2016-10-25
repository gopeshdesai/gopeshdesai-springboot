package com.gopeshdesai.springboot.controller;

import com.gopeshdesai.springboot.domain.Person;
import com.gopeshdesai.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gopeshdesai on 10/24/16.
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Person create(@RequestBody Person person) {
        Person result = personRepository.save(person);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{personId}")
    public Person get(@PathVariable String personId) {
        return personRepository.findOne(personId);
    }

}
