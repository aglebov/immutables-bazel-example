package com.example.project.app;

import com.example.project.model.ImmutablePerson;
import com.example.project.model.Person;


public class Main {

    public static void main(String[] args) {
        Person person = ImmutablePerson.builder().firstName("John").lastName("Doe").build();
        System.out.println(person.firstName() + " " + person.lastName());
    }
}
