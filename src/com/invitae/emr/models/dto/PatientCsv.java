package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Patient;
import com.invitae.emr.models.enums.Sex;
import com.opencsv.bean.CsvBindByName;

import java.time.LocalDate;

public class PatientCsv {
    @CsvBindByName(column = "Id")
    public String id;

    @CsvBindByName(column = "LAST")
    public String lastName;

    @CsvBindByName(column = "FIRST")
    public String firstName;

    @CsvBindByName(column = "BIRTHDATE")
    public String dateOfBirth;

    @CsvBindByName(column = "GENDER")
    public String sex;

    @CsvBindByName(column = "ADDRESS")
    public String streetAddress;

    @CsvBindByName(column = "CITY")
    public String city;

    @CsvBindByName(column = "STATE")
    public String state;

    @CsvBindByName(column = "ZIP")
    public String postalCode;

    public Patient toPatient() {
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Patient(firstName, lastName, address, null, null, LocalDate.parse(dateOfBirth),
                Sex.fromSingleLetter(sex), id);
    }
}