package com.invitae.emr.models;

import com.invitae.emr.models.enums.Status.ResultStatus;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The test result we send to the ordering facility
 */
public class Result {
    public String orderId;
    public OffsetDateTime completionDateTime;
    public ResultStatus status;
    public List<ClinicalInfo> observations;

    public Result(String orderId, OffsetDateTime completionDateTime, ResultStatus status,
                  List<ClinicalInfo> observations) {
        this.orderId = orderId;
        this.completionDateTime = completionDateTime;
        this.status = status;
        this.observations = observations;
    }
}
