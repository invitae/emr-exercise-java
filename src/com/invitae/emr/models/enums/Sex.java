package com.invitae.emr.models.enums;

public enum Sex {
    Male,
    Female,
    Unknown;

    public static Sex fromSingleLetter(String s) {
        switch (s) {
            case "M":
                return Male;
            case "F":
                return Female;
            default:
                return Unknown;
        }
    }
}
