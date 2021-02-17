package com.invitae.emr.models.dto;

import com.invitae.emr.models.Appointment;
import com.invitae.emr.models.Patient;
import com.invitae.emr.models.Practice;
import com.invitae.emr.models.Provider;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

public class Encounter {
    @CsvBindByName(column = "Id")
    String id;

    @CsvBindByName(column = "START")
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssX")
    OffsetDateTime start;

    @CsvBindByName(column = "STOP")
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssX")
    OffsetDateTime end;

    @CsvBindByName(column = "PATIENT")
    String patientId;

    @CsvBindByName(column = "ORGANIZATION")
    String practiceId;

    @CsvBindByName(column = "PROVIDER")
    String providerId;

    @CsvBindByName(column = "DESCRIPTION")
    String reasonForVisit;

    public Appointment toAppointment(List<Patient> patients, List<Practice> practices, List<Provider> providers) {
        var patient = patients.stream().filter(p -> p.id.equals(patientId)).findFirst();
        var provider = providers.stream().filter(p -> p.id.equals(providerId)).findFirst();
        var practice = practices.stream().filter(p -> p.id.equals(practiceId)).findFirst();

        if (patient.isPresent() && practice.isPresent() && provider.isPresent()) {
            return new Appointment(
                    id,
                    patient.get(),
                    start.atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime(),
                    Duration.between(start, end),
                    practice.get(),
                    provider.get(),
                    reasonForVisit);
        } else {
            throw new RuntimeException("Can't find the patient, practice, or provider.");
        }
    }
}
