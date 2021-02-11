package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.OrderStatus;

import java.time.LocalDateTime;

/**
 * The lab order for genetic testing
 */
public class LabOrder {
    public String id;
    public LocalDateTime dateReceived;
    public String panelCode;
    public String practiceId;
    public Patient patient;
    public Provider orderingProvider;
    public Appointment visit;
    public String[] diagnoses;
    public ClinicalInfo[] askOnEntryQuestions;
    public OrderStatus status;

    public LabOrder(String id, LocalDateTime dateReceived, String panelCode, String practiceId,
                    Patient patient, Provider orderingProvider, Appointment visit,
                    String[] diagnoses) {
        this.id = id;
        this.dateReceived = dateReceived;
        this.panelCode = panelCode;
        this.practiceId = practiceId;
        this.patient = patient;
        this.orderingProvider = orderingProvider;
        this.visit = visit;
        this.diagnoses = diagnoses;
        this.status = OrderStatus.New;
    }
}
