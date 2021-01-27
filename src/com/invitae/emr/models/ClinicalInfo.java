package com.invitae.emr.models;

/**
 * Codified clinical information
 */
public class ClinicalInfo {
    public String code;
    public String codeset;
    public String value;
    public String description;
    public String relatedGroupId;

    public ClinicalInfo(String code, String codeset, String value, String description, String relatedGroupId) {
        this.code = code;
        this.codeset = codeset;
        this.value = value;
        this.description = description;
        this.relatedGroupId = relatedGroupId;
    }
}
