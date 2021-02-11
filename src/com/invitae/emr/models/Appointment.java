package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.SchedulingStatus;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * A visit appointment for a patient
 */
public class Appointment {
    public String id;
    public Patient patient;
    public LocalDateTime dateTime;
    public Duration duration;
    public Practice practice;
    public Provider provider;
    public String reasonForVisit;
    public SchedulingStatus status;

    /**
     * Creates an appointment request with "Pending" status.
     */
    public Appointment(String id, Patient patient, LocalDateTime dateTime, Duration duration, String reasonForVisit) {
        this.id = id;
        this.patient = patient;
        this.dateTime = dateTime;
        this.duration = duration;
        this.reasonForVisit = reasonForVisit;
        this.status = SchedulingStatus.Pending;
    }

    /**
     * Creates a completed appointment.
     */
    public Appointment(String id, Patient patient, LocalDateTime dateTime, Duration duration,
                       Practice practice, Provider provider, String reasonForVisit) {
        this.id = id;
        this.patient = patient;
        this.dateTime = dateTime;
        this.duration = duration;
        this.practice = practice;
        this.provider = provider;
        this.reasonForVisit = reasonForVisit;
        this.status = SchedulingStatus.Completed;
    }
}
