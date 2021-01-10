package com.invitae.emr.models;

/**
 * The address of a person.
 */
public class Address {
    String streetAddress;
    String city;
    String state;
    String postalCode;
    String country;

    public Address(String streetAddress, String city, String state, String postalCode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }
}
