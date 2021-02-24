package com.invitae.emr.models;

/**
 * The name and transcript of the analyzed gene
 */
public class GeneAnalyzed {
    public String gene;
    public String transcript;

    public GeneAnalyzed(String gene, String transcript) {
        this.gene = gene;
        this.transcript = transcript;
    }
}
