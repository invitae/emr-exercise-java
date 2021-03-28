package com.invitae.emr.models;

import java.time.LocalDateTime;

/**
 * The report produced by our lab, for a LabOrder.
 */
public class LabReport {
    /**
     * Report ID
     */
    public final String id;

    /**
     * The ID of the original LabOrder
     */
    public final String orderId;

    /**
     * Date and time the report was produced
     */
    public final LocalDateTime createdOn;

    /**
     * List of genes and transcripts analyzed for this test
     */
    public final GeneAnalyzed[] genesAnalyzed;

    /**
     * List of reported variants
     */
    public final Variant[] variants;

    /**
     * List of clinical summaries
     */
    public final String[] clinicalSummaries;

    public LabReport(String id, String orderId, LocalDateTime createdOn, GeneAnalyzed[] genesAnalyzed,
                     Variant[] variants, String[] clinicalSummaries) {
        this.id = id;
        this.orderId = orderId;
        this.createdOn = createdOn;
        this.genesAnalyzed = genesAnalyzed;
        this.variants = variants;
        this.clinicalSummaries = clinicalSummaries;
    }
}
