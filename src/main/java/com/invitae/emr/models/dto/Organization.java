package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Practice;
import com.opencsv.bean.CsvBindByName;

public class Organization {
    @CsvBindByName(column = "Id")
    private String id;

    @CsvBindByName(column = "NAME")
    private String name;

    @CsvBindByName(column = "ADDRESS")
    private String streetAddress;

    @CsvBindByName(column = "CITY")
    private String city;

    @CsvBindByName(column = "STATE")
    private String state;

    @CsvBindByName(column = "ZIP")
    private String postalCode;

    @CsvBindByName(column = "PHONE")
    private String phoneNumber;

    public Practice toPractice() {
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Practice(id, name, address, phoneNumber);
    }
}
