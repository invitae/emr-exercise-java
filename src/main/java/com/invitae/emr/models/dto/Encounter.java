package com.invitae.emr.models.dto;

import com.invitae.emr.models.Patient;
import com.invitae.emr.models.Practice;
import com.invitae.emr.models.Provider;
import com.invitae.emr.models.Visit;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

public class Encounter {
    @CsvBindByName(column = "Id")
    private String id;

    @CsvBindByName(column = "START")
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssX")
    private OffsetDateTime start;

    @CsvBindByName(column = "STOP")
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssX")
    private OffsetDateTime end;

    @CsvBindByName(column = "PATIENT")
    private String patientId;

    @CsvBindByName(column = "ORGANIZATION")
    private String practiceId;

    @CsvBindByName(column = "PROVIDER")
    private String providerId;

    @CsvBindByName(column = "DESCRIPTION")
    private String reasonForVisit;

    public Visit toVisit(List<Patient> patients, List<Practice> practices, List<Provider> providers) {
        var patient = patients.stream().filter(p -> p.id.equals(patientId)).findFirst();
        var provider = providers.stream().filter(p -> p.id.equals(providerId)).findFirst();
        var practice = practices.stream().filter(p -> p.id.equals(practiceId)).findFirst();

        if (patient.isPresent() && practice.isPresent() && provider.isPresent()) {
            return new Visit(
                    id,
                    patient.get(),
                    start.atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime(),
                    end.atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime(),
                    practice.get(),
                    provider.get(),
                    reasonForVisit);
        } else {
            throw new RuntimeException("Can't find the patient, practice, or provider.");
        }
    }
}
