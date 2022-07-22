package com.company;

public class Main {
    public static void main(String[] args) {

       // Person[] people = new Person[];

        Person person = new Person("Dad", 30);
        Person person1 = new Person("Mom", 28);

        Person[] people1 = {person, person1};
        Family family = new Family(people1);
        Hostel hostel = new Hostel(family) ;
        System.out.println(hostel);
        System.out.println("quantity = " + hostel.people);
        hostel.payRent();
        hostel.payUtilities();
}}