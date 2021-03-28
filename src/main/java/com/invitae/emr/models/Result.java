package com.invitae.emr.models;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The test result we send to the ordering facility
 */
public class Result {
    /**
     * The ID of the original LabOrder
     */
    public final String orderId;

    /**
     * Date and time this result was created
     */
    public final OffsetDateTime completionDateTime;

    /**
     * List of observations reported for this test
     */
    public final List<ClinicalInfo> observations;

    public Result(String orderId, OffsetDateTime completionDateTime, List<ClinicalInfo> observations) {
        this.orderId = orderId;
        this.completionDateTime = completionDateTime;
        this.observations = observations;
    }
}
