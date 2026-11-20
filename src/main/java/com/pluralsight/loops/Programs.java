package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {

        ArrayList<Person>
                people = new ArrayList<>();
        people.add(new Person("Ethan", "Carter", 24));
        people.add(new Person("Sophia", "Bennett", 31));
        people.add(new Person("Liam", "Walker", 19));
        people.add(new Person("Olivia", "Reed", 42));
        people.add(new Person("Noah", "Foster", 27));
        people.add(new Person("Ava", "Murphy", 35));
        people.add(new Person("Mason", "Price", 56));
        people.add(new Person("Isabella", "Coleman", 22));
        people.add(new Person("Lucas", "Perry", 48));
        people.add(new Person("Mia", "Simmons", 29));
        people.add(new Person("Yuri", "fujiwara", 22));
    }

    Scanner scanner = new Scanner(System.in);
    System.out("Enter a first or last name: ");
    String searchName = scanner.nextLine();

    ArrayList<Person> matches = new ArrayList<>();
}
