package com.sushil.LearningSpring.service;

import com.sushil.LearningSpring.dao.PersonDao;
import com.sushil.LearningSpring.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
