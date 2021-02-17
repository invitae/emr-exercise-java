package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Practice;
import com.opencsv.bean.CsvBindByName;

public class Organization {
    @CsvBindByName(column = "Id")
    String id;

    @CsvBindByName(column = "NAME")
    String name;

    @CsvBindByName(column = "ADDRESS")
    String streetAddress;

    @CsvBindByName(column = "CITY")
    String city;

    @CsvBindByName(column = "STATE")
    String state;

    @CsvBindByName(column = "ZIP")
    String postalCode;

    @CsvBindByName(column = "PHONE")
    String phoneNumber;

    public Practice toPractice() {
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Practice(id, name, address);
    }
}
