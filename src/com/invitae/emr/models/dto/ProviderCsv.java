package com.invitae.emr.models.dto;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.Availability;
import com.invitae.emr.models.Provider;
import com.opencsv.bean.CsvBindByName;

public class ProviderCsv {
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

    public Provider toProvider() {
        var names = name.split(" ");
        var firstName = names[0];
        var lastName = names[1];
        var address = new Address(streetAddress, city, state, postalCode, "US");
        return new Provider(firstName, lastName, id, address, null, null, Availability.defaultAvailability());
    }
}
