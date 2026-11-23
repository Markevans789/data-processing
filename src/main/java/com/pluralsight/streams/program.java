package com.pluralsight.streams;

import com.pluralsight.loops.Person;

import java.util.*;
import java.util.stream.collectors;

public class program {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        int youngestAge = people.stream()
                .map(Person::getAge)
                .sorted()
                .findFirst()
                .orElse(0);
    }

    private Arrays people;
    int oldestAge = people.stream()
            .map(Person::getAge)
            .sorted()
            .reduce((first, second) -> second)
            .orElse(0);
}
