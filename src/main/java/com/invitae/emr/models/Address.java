package com.invitae.emr.models;

/**
 * The address of a person.
 */
public class Address {
    public String streetAddress;
    public String city;
    public String state;
    public String postalCode;
    public String country;

    public Address(String streetAddress, String city, String state, String postalCode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }
}
