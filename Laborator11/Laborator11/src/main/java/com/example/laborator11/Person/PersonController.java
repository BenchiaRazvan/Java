package com.example.laborator11.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "test/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService newPersonService){

        this.personService = newPersonService;
    }
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.showPersons();
    }
    @PostMapping
    public void insertPerson(@RequestBody Person person){
        personService.insertPerson(person);
    }
    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Integer personID){
        personService.deletePerson(personID);
    }
    @PutMapping(path = "{personID}")
    public void updatePerson(@PathVariable("personID") int personId, @RequestParam(required = false) String name, @RequestParam(required = false) int age){
        personService.updateStudent(personId,name,age);
    }

}
