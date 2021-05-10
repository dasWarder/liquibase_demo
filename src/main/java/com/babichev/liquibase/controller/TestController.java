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
    public String createPerson(@RequestParam String name, @RequestParam String surname) {
        Person save = personRepository.save(new Person(name, surname, "unknown", "unknown"));
        return save + "was saved successfully";
    }

    @GetMapping(value = "/person")
    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }
}
