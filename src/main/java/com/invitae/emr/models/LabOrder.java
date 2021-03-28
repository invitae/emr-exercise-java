package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.OrderStatus;

import java.time.LocalDateTime;

/**
 * The lab order for genetic testing
 */
public class LabOrder {
    public final String id;
    public final LocalDateTime dateReceived;
    public final String panelCode;
    public final String practiceId;
    public final Patient patient;
    public final Provider orderingProvider;
    public final Visit visit;
    public final String[] diagnoses;
    public final OrderStatus status;

    public LabOrder(String id, LocalDateTime dateReceived, String panelCode, String practiceId,
                    Patient patient, Provider orderingProvider, Visit visit,
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
