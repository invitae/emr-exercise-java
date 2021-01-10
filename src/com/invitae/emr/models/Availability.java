package com.invitae.emr.models;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * The availability of a provider.
 */
public class Availability {
    DayOfWeek[] days;
    LocalTime startTime;
    LocalTime endTime;

    public Availability(DayOfWeek[] days, LocalTime startTime, LocalTime endTime) {
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Creates an Availability with default values.
     *
     * @return Availability with Monday to Friday and 8am to 6pm.
     */
    public static Availability defaultAvailability() {
        var weekDays = new DayOfWeek[]{
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY
        };
        return new Availability(weekDays, LocalTime.of(8, 0), LocalTime.of(18, 0));
    }
}
