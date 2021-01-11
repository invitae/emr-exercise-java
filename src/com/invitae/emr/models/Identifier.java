package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;

public class Identifier {
    public String id;
    public IdType idType;

    public Identifier(String id, IdType idType) {
        this.id = id;
        this.idType = idType;
    }
}
