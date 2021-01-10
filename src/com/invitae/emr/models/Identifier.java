package com.invitae.emr.models;

import com.invitae.emr.models.enums.IdType;

public class Identifier {
    String id;
    IdType idType;

    public Identifier(String id, IdType idType) {
        this.id = id;
        this.idType = idType;
    }
}
