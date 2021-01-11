package com.invitae.emr.models;

/**
 * Codified clinical information
 */
public class ClinicalCode {
    public String code;
    public String codeset;
    public String value;
    public String description;

    public ClinicalCode(String code, String codeset, String value, String description) {
        this.code = code;
        this.codeset = codeset;
        this.value = value;
        this.description = description;
    }
}
