package com.invitae.emr.models;

import com.invitae.emr.models.enums.Sex;

import java.time.LocalDate;
import java.util.UUID;

/**
 * The patient.
 */
public class Patient extends Person {
    public final String id;
    public final LocalDate dateOfBirth;
    public final Sex sex;

    /**
     * Creates a new patient with a random ID
     */
    public Patient(String firstName, String lastName, Address address, LocalDate dateOfBirth, Sex sex) {
        super(firstName, lastName, address);
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.id = UUID.randomUUID().toString();
    }

    public Patient(String firstName, String lastName, Address address, LocalDate dateOfBirth, Sex sex, String id) {
        super(firstName, lastName, address);
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.id = id;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + id + ")";
    }
}
