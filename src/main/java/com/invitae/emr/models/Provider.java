package com.invitae.emr.models;

import com.invitae.emr.models.enums.Language;

import java.util.ArrayList;
import java.util.List;

/**
 * The health care provider
 */
public class Provider extends Person {
    public String id;
    public Language[] languages;
    public Availability availability;
    public List<Appointment> appointments;

    public Provider(String firstName, String lastName, String id, Address address, String phoneNumber, String email,
                    Availability availability) {
        super(firstName, lastName, address, phoneNumber, email);
        this.id = id;
        this.availability = availability;
        this.appointments = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Dr. " + lastName + " (ID: " + id + ")";
    }
}
