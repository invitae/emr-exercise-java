package com.invitae.emr.models;

import com.invitae.emr.models.enums.VariantFinding.VariantClassification;
import com.invitae.emr.models.enums.VariantFinding.Zygosity;

import java.time.LocalDateTime;

/**
 * The report produced by our lab, for a LabOrder.
 */
public class LabReport {
    public String id;
    public String orderId;
    public LocalDateTime createdOn;
    public String type;
    public String subType;
    public GeneAnalyzed[] genesAnalyzed;
    public Variant[] variants;
    public String[] clinicalSummaries;

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

/**
 * The name and transcript of the analyzed gene
 */
class GeneAnalyzed {
    public String gene;
    public String transcript;

    public GeneAnalyzed(String gene, String transcript) {
        this.gene = gene;
        this.transcript = transcript;
    }
}

/**
 * Reported findings of the variant
 */
class Variant {
    public String name;
    public VariantClassification variantClassification;
    public String gene;
    public Zygosity zygosity;

    public Variant(String name, VariantClassification variantClassification, String gene,
                   Zygosity zygosity) {
        this.name = name;
        this.variantClassification = variantClassification;
        this.gene = gene;
        this.zygosity = zygosity;
    }
}
