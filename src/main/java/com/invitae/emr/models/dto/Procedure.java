package com.invitae.emr.models.dto;

import com.invitae.emr.models.LabOrder;
import com.invitae.emr.models.Patient;
import com.invitae.emr.models.Visit;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

public class Procedure {
    @CsvBindByName(column = "DATE")
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssX")
    private OffsetDateTime dateTimeReceived;

    @CsvBindByName(column = "PATIENT")
    private String patientId;

    @CsvBindByName(column = "ENCOUNTER")
    private String encounterId;

    @CsvBindByName(column = "CODE")
    private String code;

    @CsvBindByName(column = "DESCRIPTION")
    private String description;

    @CsvBindByName(column = "REASONCODE")
    private String reasonCode;

    @CsvBindByName(column = "REASONDESCRIPTION")
    private String reasonDescription;

    public LabOrder toLabOrder(List<Patient> patients, List<Visit> visits) {
        var patient = patients.stream().filter(p -> p.id.equals(patientId)).findFirst();
        var visit = visits.stream().filter(v -> v.id.equals(encounterId)).findFirst();
        var id = UUID.randomUUID();

        if (patient.isPresent() && visit.isPresent()) {
            return new LabOrder(
                    id.toString(),
                    dateTimeReceived.atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime(),
                    code,
                    visit.get().practice.id,
                    patient.get(),
                    visit.get().provider,
                    reasonDescription.isEmpty() ? null : new String[]{reasonDescription});
        } else {
            throw new RuntimeException("Can't find the patient or visit.");
        }
    }
}
