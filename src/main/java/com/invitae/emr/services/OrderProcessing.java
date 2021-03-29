package com.invitae.emr.services;

import com.invitae.emr.models.LabOrder;
import com.invitae.emr.models.Practice;
import com.invitae.emr.models.Requisition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Provides services for processing lab orders.
 */
public class OrderProcessing {
    /**
     * List of test panel codes we offer at our lab
     */
    private static final Set<String> testCatalog = Set.of(
            "PR60515",
            "PR60662",
            "PR61987",
            "PR72558",
            "PR74556",
            "PR81780",
            "PR82363");

    /**
     * Practices we accept orders from
     */
    private static final Set<Practice> practices = new HashSet<>();

    /**
     * Add practices to the practice list
     *
     * @param newPractices The practices to add
     */
    public static void addPractices(List<Practice> newPractices) {
        practices.addAll(newPractices);
    }

    /**
     * Process a list of orders
     *
     * @param orders The orders to process
     * @return List of requisitions
     */
    public static List<Requisition> processOrders(List<LabOrder> orders) {
        return new ArrayList<>();
    }
}
