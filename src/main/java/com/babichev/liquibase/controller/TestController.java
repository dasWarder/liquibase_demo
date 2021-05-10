package com.babichev.liquibase.controller;

import com.babichev.liquibase.model.Person;
import com.babichev.liquibase.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    private PersonRepository personRepository;

    public TestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping(value = "/person")
    @ResponseBody
    public String createPerson(@RequestParam String name) {
        Person save = personRepository.save(new Person(name, "3.14"));
        return save.toString() + "was saved successfully";
    }

    @GetMapping(value = "/person")
    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }
}
