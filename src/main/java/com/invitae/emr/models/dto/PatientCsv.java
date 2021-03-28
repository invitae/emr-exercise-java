package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Patient;
import com.invitae.emr.models.enums.Sex;
import com.opencsv.bean.CsvBindByName;

import java.time.LocalDate;

public class PatientCsv {
    @CsvBindByName(column = "Id")
    private String id;

    @CsvBindByName(column = "LAST")
    private String lastName;

    @CsvBindByName(column = "FIRST")
    private String firstName;

    @CsvBindByName(column = "BIRTHDATE")
    private String dateOfBirth;

    @CsvBindByName(column = "GENDER")
    private String sex;

    @CsvBindByName(column = "ADDRESS")
    private String streetAddress;

    @CsvBindByName(column = "CITY")
    private String city;

    @CsvBindByName(column = "STATE")
    private String state;

    @CsvBindByName(column = "ZIP")
    private String postalCode;

    public Patient toPatient() {
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Patient(firstName, lastName, address, LocalDate.parse(dateOfBirth), Sex.fromSingleLetter(sex), id);
    }
}
