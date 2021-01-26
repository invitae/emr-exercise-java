package com.invitae.emr.models;

import java.util.ArrayList;
import java.util.List;

/**
 * The medical practice facility
 */
public class Practice {
    public String name;
    public String id;
    public Address address;
    public List<Provider> members;

    public Practice(String name, Address address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.members = new ArrayList<>();
    }
}
