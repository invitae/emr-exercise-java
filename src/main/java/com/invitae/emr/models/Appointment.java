package com.invitae.emr.models;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * An appointment request for an office visit
 */
public class Appointment {
    public final String id;

    /**
     * The patient requesting the visit
     */
    public final Patient patient;

    /**
     * The start time of the visit
     */
    public final LocalDateTime dateTime;

    /**
     * The length of the visit
     */
    public final Duration duration;

    /**
     * The practice where the visit will be scheduled
     */
    public final Practice practice;

    /**
     * The primary reason for the visit
     */
    public final String reasonForVisit;

    public Appointment(Patient patient, LocalDateTime dateTime, Duration duration, Practice practice,
                       String reasonForVisit) {
        this.id = UUID.randomUUID().toString();
        this.patient = patient;
        this.dateTime = dateTime;
        this.duration = duration;
        this.practice = practice;
        this.reasonForVisit = reasonForVisit;
    }
}
