package com.greencacti.service;

import com.greencacti.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.UUID;

/**
 * Created by baominw on 4/6/17.
 */
interface PersonRepository extends Repository<Person, Long> {

    Page<Person> findAll(Pageable pageable);

    Person findByUuid(String uuid);
}
