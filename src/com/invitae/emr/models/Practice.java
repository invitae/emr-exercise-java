package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;

import java.util.List;

/**
 * The medical practice facility
 */
public class Practice {
    public String name;
    public Identifier identifier;
    public Address address;
    public List<Provider> members;

    public Practice(String name, Address address, String id) {
        this.name = name;
        this.address = address;
        this.identifier = new Identifier(id, IdType.Practice);
    }
}
