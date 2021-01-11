package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.OrderStatus;

import java.time.LocalDateTime;

/**
 * The lab order for genetic testing
 */
public class LabOrder {
    public LocalDateTime dateReceived;
    public Practice practice;
    public Patient patient;
    public Provider orderingProvider;
    public Appointment visit;
    public Insurance insurance;
    public OrderStatus status;
    public ClinicalCode[] diagnoses;
    public ClinicalCode[] askOnEntryQuestions;
}
