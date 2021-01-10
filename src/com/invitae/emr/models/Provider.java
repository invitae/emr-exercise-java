package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;
import com.invitae.emr.models.enums.Language;

/**
 * The health care provider
 */
public class Provider extends Person {
    String specialty;
    Language[] languages;
    Availability availability;

    public Provider(String firstName, String lastName, String npi, Address address, String phoneNumber, String email,
                    String specialty, Language[] languages, Availability availability) {
        super(firstName, lastName, new Identifier(npi, IdType.NPI), address, phoneNumber, email);
        this.specialty = specialty;
        this.languages = languages;
        this.availability = availability;
    }
}
