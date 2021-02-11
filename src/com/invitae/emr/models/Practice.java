package com.invitae.emr.models;

import java.util.ArrayList;
import java.util.List;

/**
 * The medical practice facility
 */
public class Practice {
    public String id;
    public String name;
    public Address address;
    public List<Provider> members;

    public Practice(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.members = new ArrayList<>();
    }
}
