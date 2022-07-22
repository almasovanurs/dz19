package com.company;

public class Apartment extends Dwelling{
    public Apartment(Family people) {
        super(people);
    }

    @Override
    public void payRent() {
        System.out.println("Pay rent");


    }

    @Override
    public void payUtilities() {
        System.out.println("Don´t pay utilities");

    }
}
