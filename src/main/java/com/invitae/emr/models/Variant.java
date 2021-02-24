package com.invitae.emr.models;

import com.invitae.emr.models.enums.VariantFinding.VariantClassification;
import com.invitae.emr.models.enums.VariantFinding.Zygosity;

/**
 * Reported findings of the variant
 */
public class Variant {
    public String name;
    public VariantClassification classification;
    public String gene;
    public Zygosity zygosity;

    public Variant(String name, VariantClassification classification, String gene, Zygosity zygosity) {
        this.name = name;
        this.classification = classification;
        this.gene = gene;
        this.zygosity = zygosity;
    }
}
