package com.invitae.emr.models.dto;

import com.invitae.emr.models.*;

import java.util.List;

/**
 * A container for sample data.
 */
public class SampleData {
    public final List<Patient> patients;
    public final List<Provider> providers;
    public final List<Practice> practices;
    public final List<Visit> visits;
    public final List<LabOrder> labOrders;

    public SampleData(List<Patient> patients, List<Provider> providers,
                      List<Practice> practices, List<Visit> visits,
                      List<LabOrder> labOrders) {
        this.patients = patients;
        this.providers = providers;
        this.practices = practices;
        this.visits = visits;
        this.labOrders = labOrders;
    }
}
