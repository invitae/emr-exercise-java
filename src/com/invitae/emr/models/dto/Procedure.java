package com.invitae.emr.models.dto;

import com.invitae.emr.models.Appointment;
import com.invitae.emr.models.LabOrder;
import com.invitae.emr.models.Patient;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

public class Procedure {
    @CsvBindByName(column = "DATE")
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssX")
    OffsetDateTime dateTimeReceived;

    @CsvBindByName(column = "PATIENT")
    String patientId;

    @CsvBindByName(column = "ENCOUNTER")
    String encounterId;

    @CsvBindByName(column = "CODE")
    String code;

    @CsvBindByName(column = "DESCRIPTION")
    String description;

    @CsvBindByName(column = "REASONCODE")
    String reasonCode;

    @CsvBindByName(column = "REASONDESCRIPTION")
    String reasonDescription;

    public LabOrder toLabOrder(List<Patient> patients, List<Appointment> visits) {
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
                    visit.get(),
                    reasonDescription.isEmpty() ? null : new String[]{reasonDescription});
        } else {
            throw new RuntimeException("Can't find the patient or visit.");
        }
    }
}
