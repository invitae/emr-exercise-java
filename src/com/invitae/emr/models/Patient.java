package com.invitae.emr.models;

import com.invitae.emr.models.enums.Sex;

import java.time.LocalDate;

/**
 * The patient.
 */
public class Patient extends Person {
    public LocalDate dateOfBirth;
    public Sex sex;
    public String mrn;

    public Patient(String firstName, String lastName, Address address, String phoneNumber, String email,
                   LocalDate dateOfBirth, Sex sex, String mrn) {
        super(firstName, lastName, address, phoneNumber, email);
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.mrn = mrn;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (MRN " + mrn + ")";
    }
}
