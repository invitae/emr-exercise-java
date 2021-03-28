package com.invitae.emr.models;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * An office visit
 */
public class Visit {
    public final String id;
    public final Patient patient;
    public final LocalDateTime start;
    public final LocalDateTime end;
    public final Practice practice;
    public final Provider provider;
    public final String reasonForVisit;

    /**
     * Creates a new visit with a random UUID
     */
    public Visit(Patient patient, LocalDateTime start, LocalDateTime end, Practice practice,
                 Provider provider, String reasonForVisit) {
        this.id = UUID.randomUUID().toString();
        this.patient = patient;
        this.start = start;
        this.end = end;
        this.practice = practice;
        this.provider = provider;
        this.reasonForVisit = reasonForVisit;
    }

    public Visit(String id, Patient patient, LocalDateTime start, LocalDateTime end, Practice practice,
                 Provider provider, String reasonForVisit) {
        this.id = id;
        this.patient = patient;
        this.start = start;
        this.end = end;
        this.practice = practice;
        this.provider = provider;
        this.reasonForVisit = reasonForVisit;
    }
}
