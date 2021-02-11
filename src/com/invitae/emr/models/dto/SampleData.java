package com.invitae.emr.models.dto;

import com.invitae.emr.models.*;

import java.util.List;

/**
 * A container for sample data.
 */
public class SampleData {
    public List<Patient> patients;
    public List<Provider> providers;
    public List<Practice> practices;
    public List<Appointment> visits;
    public List<LabOrder> labOrders;

    public SampleData(List<Patient> patients, List<Provider> providers,
                      List<Practice> practices, List<Appointment> visits,
                      List<LabOrder> labOrders) {
        this.patients = patients;
        this.providers = providers;
        this.practices = practices;
        this.visits = visits;
        this.labOrders = labOrders;
    }
}
