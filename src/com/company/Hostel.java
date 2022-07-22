package com.company;

public class Hostel extends Dwelling{


    public Hostel(Family people) {
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
