package Streams;/*
//Jamie Doyle
//16:22:02/01/2024
//Project : 
*/

import javax.swing.*;
import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Collectors;

public class Streamed2 {

    public static void main(String[] args) {
        List<Person> people = getPeople();


        // Imperative Approach
//        List<Person> females = new ArrayList<>();
//
//        for (Person person : people) {
//            if (person.getGender().equals(Gender.FEMALE)) {
//                females.add(person);
//            }
//        }
//
//        females.forEach(System.out::println);




        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());

        // sorted.forEach(System.out::println);

        // All match

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
        // System.out.println(allMatch);

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 1);
        // System.out.println(anyMatch);

        // None match
        boolean noMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Michelle O'Neill"));

        // System.out.println(noMatch);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
        //        .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge));
        //        .ifPresent(System.out::println);


        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//        });

        Optional<String> oldestFemale = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemale.ifPresent(name -> System.out.println(name));

    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("John Bond", 27, Gender.MALE),
                new Person("Thomas Touch", 23, Gender.MALE),
                new Person("Mia Doyle", 17, Gender.FEMALE),
                new Person("Michael Bing", 79, Gender.MALE),
                new Person("James O'Connor", 76, Gender.MALE),
                new Person("Marge Doyle", 36, Gender.FEMALE),
                new Person("Michelle O'Neill", 01, Gender.FEMALE)
        );
    }


}//class
