package com.greencacti.web;

import com.greencacti.domain.Person;
import com.greencacti.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by baominw on 4/6/17.
 */
@org.springframework.web.bind.annotation.RestController("/rest")
public class RestController {

    @Autowired
    private PersonService personService;

    @GetMapping("/rest/persons")
    @ResponseBody
    @Transactional(readOnly = true)
    List<Person> findPersons() {
        return personService.findPersons(null).getContent();
    }

    @GetMapping(path = "/rest/person/{uuid}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @Transactional(readOnly = true)
    Person findByUuid(@PathVariable String uuid) {
        return personService.findByUuid(uuid);
    }
}
