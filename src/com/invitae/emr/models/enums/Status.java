package com.invitae.emr.models.enums;

public class Status {
    public enum SchedulingStatus {
        Pending,
        Scheduled,
        Completed,
        NoShow,
        Canceled
    }

    public enum OrderStatus {
        New,
        Resulted,
        Canceled
    }
}
