package org.fasttrackit.curs14.homework14;

import com.google.common.util.concurrent.UncheckedTimeoutException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.UncheckedIOException;
import java.util.List;

public class PersonServiceTest {
    private PersonService personService;

    @BeforeEach
    public void setup(){
        personService = new PersonService();
    }

    @Test
    public void testAddPerson(){
        Person person = new Person("Alex", 40);
        Person addedPerson = personService.addPerson(person);
        Assertions.assertNotNull(addedPerson.getId());
        Assertions.assertEquals(person.getName(), addedPerson.getName());
        Assertions.assertEquals(person.getAge(), addedPerson.getAge());
    }

    @Test
    public void testRemovePerson(){
        Person person = new Person("Alex", 40);
        Person addedPerson = personService.addPerson(person);
        Person removedPerson = personService.removePerson(addedPerson.getId());
        Assertions.assertEquals(addedPerson.getId(), removedPerson.getId());
    }

    @Test
    public void testRemovePersonNonExisting(){
        Assertions.assertThrows(UncheckedTimeoutException.class, () ->{personService.removePerson(100);});
    }

    @Test
    public void testGetAllPersons(){
        personService.addPerson(new Person("Alex", 40));
        personService.addPerson(new Person("Alina", 25));
        personService.addPerson(new Person("Ionut", 35));
        List<Person> olderPersons = personService.getPersonsOlderThan(35);
        Assertions.assertEquals(1, olderPersons.size());
        Assertions.assertEquals("Alex", olderPersons.get(0).getName());

    }

    @Test
    public void testGetPerson(){
        personService.addPerson(new Person("Alex", 40));
        personService.addPerson(new Person("Alina", 25));
        Person person = personService.getPerson("Alex");
        Assertions.assertEquals("Alex", person.getName());
        Assertions.assertEquals(40, person.getAge());
    }

    @Test
    public void testGetPersonById(){
        Person addedPerson = personService.addPerson(new Person("Alex", 40));
        Person person = personService.getPersonById(addedPerson.getId());
        Assertions.assertEquals("Alex", person.getName());
        Assertions.assertEquals(40, person.getAge());
    }

    @Test
    public void testGetPersonNonExisting(){
        Person person = personService.getPerson("NonExisting");
        Assertions.assertNull(person);
    }

    @Test
    public void testGetPersonByIdNonExisting(){
        Person person = personService.getPersonById(100);
        Assertions.assertNull(person);
    }

    @Test
    public void testGetPersonsOlderThanInvalidAge(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{personService.getPersonsOlderThan(-1);});
        Assertions.assertThrows(IllegalArgumentException.class, () -> {personService.getPersonsOlderThan(120);});
    }
}
