package org.fasttrackit.curs14.homework14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testCreatePersonWithNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{new Person(null,30);});
    }

    @Test
    public void testCreatePersonWithNameEmpty(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->{new Person("",30);});
    }

    @Test
    public void testCreatePersonWithInvalidAge(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{new Person("Alex",0);});
    }

    @Test
    public void testCreatePerson(){
        Person person = new Person("Alex", 30);
        Assertions.assertEquals("Alex", person.getName());
        Assertions.assertEquals(30, person.getAge());
    }
}
