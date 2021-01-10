package com.invitae.emr.models;

/**
 * A person.
 */
public abstract class Person {
    String firstName;
    String lastName;
    Identifier identifier;
    Address address;
    String phoneNumber;
    String email;

    public Person(String firstName, String lastName, Identifier identifier, Address address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = identifier;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
