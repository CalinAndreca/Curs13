package org.fasttrackit.curs14.homework14;

import lombok.Getter;
@Getter
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(String name, int age){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age <= 0 || age >= 120){
            throw new IllegalArgumentException("Age must be between 1 and 119");
        }
        this.name = name;
        this.age = age;
    }
}
