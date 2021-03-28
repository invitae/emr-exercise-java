package com.invitae.emr.models;

import java.time.LocalDateTime;

/**
 * The report produced by our lab, for a LabOrder.
 */
public class LabReport {
    public final String id;
    public final String orderId;
    public final LocalDateTime createdOn;
    public final String type;
    public final String subType;
    public final GeneAnalyzed[] genesAnalyzed;
    public final Variant[] variants;
    public final String[] clinicalSummaries;

    public LabReport(String id, String orderId, LocalDateTime createdOn, String type, String subType,
                     GeneAnalyzed[] genesAnalyzed, Variant[] variants, String[] clinicalSummaries) {
        this.id = id;
        this.orderId = orderId;
        this.createdOn = createdOn;
        this.type = type;
        this.subType = subType;
        this.genesAnalyzed = genesAnalyzed;
        this.variants = variants;
        this.clinicalSummaries = clinicalSummaries;
    }
}
