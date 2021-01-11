package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;
import com.invitae.emr.models.enums.Language;

import java.util.ArrayList;
import java.util.List;

/**
 * The health care provider
 */
public class Provider extends Person {
    public String specialty;
    public Language[] languages;
    public Availability availability;
    public List<Appointment> appointments;

    public Provider(String firstName, String lastName, String npi, Address address, String phoneNumber, String email,
                    String specialty, Language[] languages, Availability availability) {
        super(firstName, lastName, new Identifier(npi, IdType.NPI), address, phoneNumber, email);
        this.specialty = specialty;
        this.languages = languages;
        this.availability = availability;
        this.appointments = new ArrayList<>();
    }

    public Provider(String firstName, String lastName, String npi) {
        super(firstName, lastName, new Identifier(npi, IdType.NPI));
        this.appointments = new ArrayList<>();
        this.availability = Availability.defaultAvailability();
    }

    @Override
    public String toString() {
        return "Dr. " + lastName + " (NPI " + identifier.id + ")";
    }
}
