package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.OrderStatus;

import java.time.LocalDateTime;

/**
 * The lab order for genetic testing
 */
public class LabOrder {
    public String orderId;
    public LocalDateTime dateReceived;
    public String panelCode;
    public String practiceId;
    public Patient patient;
    public Provider orderingProvider;
    public Appointment visit;
    public ClinicalInfo[] diagnoses;
    public ClinicalInfo[] askOnEntryQuestions;
    public OrderStatus status;

    public LabOrder(String orderId, LocalDateTime dateReceived, String panelCode, String practiceId,
                    Patient patient, Provider orderingProvider, Appointment visit,
                    ClinicalInfo[] diagnoses, ClinicalInfo[] askOnEntryQuestions) {
        this.orderId = orderId;
        this.dateReceived = dateReceived;
        this.panelCode = panelCode;
        this.practiceId = practiceId;
        this.patient = patient;
        this.orderingProvider = orderingProvider;
        this.visit = visit;
        this.diagnoses = diagnoses;
        this.askOnEntryQuestions = askOnEntryQuestions;
        this.status = OrderStatus.New;
    }
}
