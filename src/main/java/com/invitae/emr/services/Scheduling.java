package com.invitae.emr.services;

import com.invitae.emr.models.Appointment;
import com.invitae.emr.models.Visit;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides services for scheduling appointments for patients.
 */
public class Scheduling {
    /**
     * Schedule appointments
     *
     * @param appointments List of appointment requests
     * @return List of visits
     */
    public static List<Visit> schedule(List<Appointment> appointments) {
        return new ArrayList<>();
    }
}
