package com.invitae.emr.models;

/**
 * A person.
 */
public abstract class Person {
    public final String firstName;
    public final String lastName;
    public final Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
