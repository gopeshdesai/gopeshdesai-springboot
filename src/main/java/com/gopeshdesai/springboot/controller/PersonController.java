package com.gopeshdesai.springboot.controller;

import com.gopeshdesai.springboot.domain.Person;
import com.gopeshdesai.springboot.repository.PersonRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gopeshdesai on 10/24/16.
 */
@Api(value = "Person resource", produces = "application/json")
@Component
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @ApiOperation(value = "Creates a person resource")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Person completed successfully"),
            @ApiResponse(code = 404, message = "Admin control not found")
    })
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Person create(@RequestBody Person person) {
        Person result = personRepository.save(person);
        return result;
    }

    @ApiOperation(value = "Get a person resource")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Person completed successfully"),
            @ApiResponse(code = 404, message = "Admin control not found")
    })
    @RequestMapping(method = RequestMethod.GET, value = "/{personId}", produces = "application/json")
    public Person get(@PathVariable String personId) {
        return personRepository.findOne(personId);
    }

}
