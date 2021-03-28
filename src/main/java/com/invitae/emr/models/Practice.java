package com.invitae.emr.models;

import java.util.ArrayList;
import java.util.List;

/**
 * The medical practice facility
 */
public class Practice {
    public final String id;
    public final String name;
    public final Address address;
    public final List<Provider> members;
    public final String phoneNumber;

    public Practice(String id, String name, Address address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.members = new ArrayList<>();
    }
}
