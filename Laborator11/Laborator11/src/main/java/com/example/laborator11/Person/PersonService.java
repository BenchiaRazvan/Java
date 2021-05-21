package com.example.laborator11.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> showPersons() {
        return personRepository.findAll();
    }

    public void insertPerson(Person person) {
        personRepository.save(person);
    }

    public void deletePerson(Integer personID) {
        boolean exists = personRepository.existsById(personID);
        if(!exists){
            throw new IllegalStateException("Person with id " + personID + "does not exists");
        }
        personRepository.deleteById(personID);
    }
    @Transactional
    public void updateStudent(int personID, String name, int age){
        Person person = personRepository.findById(personID).orElseThrow(() -> new IllegalStateException("student with id " + personID + "does not exists"));

        if (age != person.getAge()){
            person.setAge(age);
        }
        if(name != person.getName()){
            person.setName(name);
        }
    }

}
