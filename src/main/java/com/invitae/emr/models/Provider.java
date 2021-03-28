package com.invitae.emr.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The health care provider
 */
public class Provider extends Person {
    public final String id;
    public final Availability availability;
    public final List<Visit> visits;

    /**
     * Creates a new provider with a random ID
     */
    public Provider(String firstName, String lastName, Address address, Availability availability) {
        super(firstName, lastName, address);
        this.id = UUID.randomUUID().toString();
        this.availability = availability;
        this.visits = new ArrayList<>();
    }

    public Provider(String firstName, String lastName, String id, Address address, Availability availability) {
        super(firstName, lastName, address);
        this.id = id;
        this.availability = availability;
        this.visits = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Dr. " + lastName + " (ID: " + id + ")";
    }
}
