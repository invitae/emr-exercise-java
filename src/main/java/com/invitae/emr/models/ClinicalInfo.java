package com.invitae.emr.models;

/**
 * Codified clinical information
 */
public class ClinicalInfo {
    public final String code;
    public final String codeset;
    public final String value;
    public final String description;
    public final String relatedGroupId;

    public ClinicalInfo(String code, String codeset, String value, String description, String relatedGroupId) {
        this.code = code;
        this.codeset = codeset;
        this.value = value;
        this.description = description;
        this.relatedGroupId = relatedGroupId;
    }
}
