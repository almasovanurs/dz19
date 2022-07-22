package com.company;

public abstract class Dwelling  {
    Family people;

    public Dwelling(Family people) {
        this.people = people;
    }

    public abstract void payRent();
    public abstract void payUtilities();

    @Override
    public String toString() {
        return "Dwelling{" +
                "people=" + people +
                '}';
    }
}
