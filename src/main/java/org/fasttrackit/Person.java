package org.fasttrackit;

import java.util.Objects;

public class Person {
    private final String name;
    private final String age;
    private final String country;
    private final boolean isMarried;
    private final String company;

    public Person(String name, String age, String country, boolean isMarried, String company) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.isMarried = isMarried;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                ", isMarried=" + isMarried +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isMarried == person.isMarried && name.equals(person.name) && age.equals(person.age) && country.equals(person.country) && company.equals(person.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, country, isMarried, company);
    }
}
