package com.invitae.emr.models;

import com.invitae.emr.models.enums.Sex;

import java.time.LocalDate;

/**
 * The patient.
 */
public class Patient extends Person {
    public String id;
    public LocalDate dateOfBirth;
    public Sex sex;

    public Patient(String firstName, String lastName, Address address, String phoneNumber, String email,
                   LocalDate dateOfBirth, Sex sex, String id) {
        super(firstName, lastName, address, phoneNumber, email);
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.id = id;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + id + ")";
    }
}
