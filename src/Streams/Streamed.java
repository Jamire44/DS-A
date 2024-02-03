package Streams;/*
//Jamie Doyle
//18:50:30/12/2023
//Project : 
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamed {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Jamie Doyle", 100));
        people.add(new Person("Karl Doyle", 120));
        people.add(new Person("Michael Doyle", 80));
        people.add(new Person("Stephen Doyle", 102));

        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());

        sortedList.forEach(person -> System.out.println(person.name));

    }//main

    static class Person {
        String name;
        int billions;

        public Person(String name, int billions){
            this.name = name;
            this.billions = billions;
        }
    }
}//class
