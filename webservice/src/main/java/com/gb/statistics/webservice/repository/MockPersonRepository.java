package com.gb.statistics.webservice.repository;

import com.gb.statistics.webservice.entity.Person;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class MockPersonRepository implements PersonRepository {

    @Override
    public Person add(Person person) {
        if (person.getName().equals("Gates")) return new Person(4, "Gates");
        return null;
    }

    @Override
    public boolean isExists(int id) {
        return !(this.getById(id) == null);
    }

    @Override
    public boolean delete(Person p) {
        return p.getId() < 100;
    }

    @Override
    public List<Person> getAll() {
        List<Person> p = new LinkedList<Person>();
        p.add(new Person(1, "Putin"));
        p.add(new Person(2, "Medved"));
        p.add(new Person(3, "Nava"));
        return p;
    }

    @Override
    public Person getById(int id) {
        return new Person(id, "Test");
    }
}
