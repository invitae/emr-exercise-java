package com.invitae.emr.models;

import com.invitae.emr.models.enums.Language;

import java.util.ArrayList;
import java.util.List;

/**
 * The health care provider
 */
public class Provider extends Person {
    public String npi;
    public Language[] languages;
    public Availability availability;
    public List<Appointment> appointments;

    public Provider(String firstName, String lastName, String npi, Address address, String phoneNumber, String email,
                    Language[] languages, Availability availability) {
        super(firstName, lastName, address, phoneNumber, email);
        this.npi = npi;
        this.languages = languages;
        this.availability = availability;
        this.appointments = new ArrayList<>();
    }

    public Provider(String firstName, String lastName, String npi) {
        super(firstName, lastName);
        this.npi = npi;
        this.appointments = new ArrayList<>();
        this.availability = Availability.defaultAvailability();
    }

    @Override
    public String toString() {
        return "Dr. " + lastName + " (NPI " + npi + ")";
    }
}
