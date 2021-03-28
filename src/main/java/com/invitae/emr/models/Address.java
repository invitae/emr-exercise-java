package com.invitae.emr.models;

/**
 * The address of a person or an organization
 */
public class Address {
    public final String streetAddress;
    public final String city;
    public final String state;
    public final String postalCode;
    public final String country;

    public Address(String streetAddress, String city, String state, String postalCode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }
}
