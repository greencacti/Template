package com.greencacti.service;

import com.greencacti.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by baominw on 4/6/17.
 */
@Component("personService")
@Transactional
class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Page<Person> findPersons(Pageable pageable) {
        return this.personRepository.findAll(null);
    }

    @Override
    public Person findByUuid(String uuid) {
        return this.personRepository.findByUuid(uuid);
    }
}
