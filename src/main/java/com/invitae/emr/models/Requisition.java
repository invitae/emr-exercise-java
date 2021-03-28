package com.invitae.emr.models;

import java.time.LocalDateTime;

/**
 * The requisition is used to manage and document a test in our lab
 */
public class Requisition {
    public final String id;
    public final LocalDateTime dateCreated;
    public final String panelCode;
    public final Practice practice;
    public final Patient patient;
    public final Provider orderingProvider;
    public final Visit visit;
    public final String[] reasonsForTest;

    public Requisition(String id, LocalDateTime dateCreated, String panelCode, Practice practice, Patient patient,
                       Provider orderingProvider, Visit visit, String[] reasonsForTest) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.panelCode = panelCode;
        this.practice = practice;
        this.patient = patient;
        this.orderingProvider = orderingProvider;
        this.visit = visit;
        this.reasonsForTest = reasonsForTest;
    }
}
