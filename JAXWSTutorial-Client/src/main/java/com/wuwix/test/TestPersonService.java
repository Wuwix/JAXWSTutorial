package com.wuwix.test;


import com.wuwix.generatedfiles.Person;
import com.wuwix.generatedfiles.PersonService;
import com.wuwix.generatedfiles.PersonServiceImplService;

import java.util.Arrays;


public class TestPersonService {

    public static void main(String[] args) {

        PersonServiceImplService serviceImpl = new PersonServiceImplService();

        PersonService service = serviceImpl.getPersonServiceImplPort();

        Person p1 = new Person(); p1.setName("WAwrz"); p1.setId(3); p1.setAge(55);
        Person p2 = new Person(); p2.setName("Mare"); p2.setId(4); p2.setAge(44);

        System.out.println("Add Person Status="+service.addPerson(p1));
        System.out.println("Add Person Status="+service.addPerson(p2));

        //get person
        System.out.println(service.getPerson(3));

        //get all persons
        System.out.println(Arrays.asList(service.getAllPersons()));

        //delete person
        System.out.println("Delete Person Status="+service.deletePerson(2));

        //get all persons
        System.out.println(Arrays.asList(service.getAllPersons()));

    }

}
