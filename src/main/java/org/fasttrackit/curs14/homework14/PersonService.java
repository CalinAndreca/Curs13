package org.fasttrackit.curs14.homework14;

import com.google.common.util.concurrent.UncheckedTimeoutException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private int nextId = 0;
    private Map<Integer, Person> persons = new HashMap<>();

    public Person addPerson(Person person){
        int id = nextId++;
        person = new Person(person.getName(), person.getAge());
        persons.put(id, person);
        return person;
    }

    public Person removePerson(int id){
        Person person = persons.remove(id);
        if(person == null){
            throw new UncheckedTimeoutException("Person with ID " + id + "does not exist");
        }
        return person;
    }

    public List<Person> getAllPersons(){
        return new ArrayList<>(persons.values());
    }

    public List<Person> getPersonsOlderThan(int age){
        if(age <= 0 || age >=120){
            throw new IllegalArgumentException("Age must be between 1 and 119");
        }
        List<Person> olderPersons = new ArrayList<>();
        for(Person person : persons.values()){
            if (person.getAge() > age){
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }
    public List<String> getAllPersonName(){
        List<String> names = new ArrayList<>();
        for(Person person : persons.values()){
            names.add(person.getName());
        }
        return names;
    }

    public Person getPerson(String name){
        for (Person person : persons.values()){
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
    public Person getPersonById(int id){
        return persons.get(id);
    }
}
