package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;
import com.invitae.emr.models.enums.Sex;

import java.time.LocalDate;

/**
 * The patient.
 */
public class Patient extends Person {
    public LocalDate dateOfBirth;
    public Sex sex;
    public String ssn;

    public Patient(String firstName, String lastName, String mrn, Address address, String phoneNumber, String email,
                   LocalDate dateOfBirth, Sex sex, String ssn) {
        super(firstName, lastName, new Identifier(mrn, IdType.MRN), address, phoneNumber, email);
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.ssn = ssn;
    }

    public Patient(String firstName, String lastName, String mrn) {
        super(firstName, lastName, new Identifier(mrn, IdType.MRN));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (MRN " + identifier.id + ")";
    }
}
