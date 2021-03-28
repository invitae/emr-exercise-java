package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Patient;
import com.invitae.emr.models.enums.Sex;
import com.opencsv.bean.CsvBindByName;

import java.time.LocalDate;

public class PatientCsv {
    @CsvBindByName(column = "Id")
    String id;

    @CsvBindByName(column = "LAST")
    String lastName;

    @CsvBindByName(column = "FIRST")
    String firstName;

    @CsvBindByName(column = "BIRTHDATE")
    String dateOfBirth;

    @CsvBindByName(column = "GENDER")
    String sex;

    @CsvBindByName(column = "ADDRESS")
    String streetAddress;

    @CsvBindByName(column = "CITY")
    String city;

    @CsvBindByName(column = "STATE")
    String state;

    @CsvBindByName(column = "ZIP")
    String postalCode;

    public Patient toPatient() {
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Patient(firstName, lastName, address, LocalDate.parse(dateOfBirth), Sex.fromSingleLetter(sex), id);
    }
}
