package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Availability;
import com.invitae.emr.models.Provider;
import com.opencsv.bean.CsvBindByName;

public class ProviderCsv {
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

    public Provider toProvider() {
        var names = name.split(" ");
        var firstName = names[0];
        var lastName = names[1];
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Provider(firstName, lastName, id, address, Availability.defaultAvailability);
    }
}
