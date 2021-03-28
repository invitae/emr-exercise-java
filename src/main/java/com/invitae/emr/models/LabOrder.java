package com.invitae.emr.models;

import java.time.LocalDateTime;

/**
 * The lab order for genetic testing
 */
public class LabOrder {
    /**
     * The order ID
     */
    public final String id;

    /**
     * Date and time the order was received
     */
    public final LocalDateTime dateReceived;

    /**
     * The product code of the test
     */
    public final String panelCode;

    /**
     * The ID of the practice where this order was sent from
     */
    public final String practiceId;

    /**
     * The patient
     */
    public final Patient patient;

    /**
     * The ordering provider
     */
    public final Provider orderingProvider;

    /**
     * List of diagnoses
     */
    public final String[] diagnoses;

    public LabOrder(String id, LocalDateTime dateReceived, String panelCode, String practiceId, Patient patient,
                    Provider orderingProvider, String[] diagnoses) {
        this.id = id;
        this.dateReceived = dateReceived;
        this.panelCode = panelCode;
        this.practiceId = practiceId;
        this.patient = patient;
        this.orderingProvider = orderingProvider;
        this.diagnoses = diagnoses;
    }
}
