package com.invitae.emr.models.enums;

public class VariantFinding {
    public enum VariantClassification {
        Pathogenic,
        LikelyPathogenic,
        UncertainSignificance,
        LikelyBenign,
        Benign
    }

    public enum Zygosity {
        Heterozygous,
        Homozygous
    }
}
