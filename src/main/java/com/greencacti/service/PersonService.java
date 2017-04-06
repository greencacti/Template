package com.greencacti.service;

import com.greencacti.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by baominw on 4/6/17.
 */
public interface PersonService {

    Page<Person> findPersons(Pageable pageable);

    Person findByUuid(String uuid);
}
