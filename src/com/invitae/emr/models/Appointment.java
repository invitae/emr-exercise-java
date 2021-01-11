package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.SchedulingStatus;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * A visit appointment for a patient
 */
public class Appointment {
    public Patient patient;
    public LocalDateTime dateTime;
    public Duration duration;
    public Provider provider;
    public String reasonForVisit;
    public SchedulingStatus status;

    /**
     * Creates an appointment request with "Pending" status.
     *
     * @param patient        The patient requesting the appointment
     * @param dateTime       Date and time of the visit
     * @param duration       Duration of the visit
     * @param reasonForVisit Primary reason for the visit
     */
    public Appointment(Patient patient, LocalDateTime dateTime, Duration duration, String reasonForVisit) {
        this.patient = patient;
        this.dateTime = dateTime;
        this.duration = duration;
        this.reasonForVisit = reasonForVisit;
        this.status = SchedulingStatus.Pending;
    }
}
