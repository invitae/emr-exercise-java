package com.invitae.emr.models;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * The availability of a provider.
 */
public class Availability {
    public final DayOfWeek[] days;
    public final LocalTime startTime;
    public final LocalTime endTime;

    private static final DayOfWeek[] weekDays = new DayOfWeek[]{
            DayOfWeek.MONDAY,
            DayOfWeek.TUESDAY,
            DayOfWeek.WEDNESDAY,
            DayOfWeek.THURSDAY,
            DayOfWeek.FRIDAY
    };

    public static final Availability defaultAvailability = new Availability(weekDays, LocalTime.of(8, 0),
            LocalTime.of(18, 0));

    public Availability(DayOfWeek[] days, LocalTime startTime, LocalTime endTime) {
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
