package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;
import com.invitae.emr.models.enums.Sex;

import java.time.LocalDate;

/**
 * The patient.
 */
public class Patient extends Person {
    LocalDate dateOfBirth;
    Sex sex;
    String ssn;

    public Patient(String firstName, String lastName, String mrn, Address address, String phoneNumber, String email,
                   LocalDate dateOfBirth, Sex sex, String ssn) {
        super(firstName, lastName, new Identifier(mrn, IdType.MRN), address, phoneNumber, email);
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.ssn = ssn;
    }
}
