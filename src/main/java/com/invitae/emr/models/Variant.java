package com.invitae.emr.models;

import com.invitae.emr.models.enums.VariantFinding.VariantClassification;
import com.invitae.emr.models.enums.VariantFinding.Zygosity;

/**
 * Reported findings of the variant
 */
public class Variant {
    public final String name;
    public final VariantClassification classification;
    public final String gene;
    public final Zygosity zygosity;

    public Variant(String name, VariantClassification classification, String gene, Zygosity zygosity) {
        this.name = name;
        this.classification = classification;
        this.gene = gene;
        this.zygosity = zygosity;
    }
}
