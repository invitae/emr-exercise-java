package com.invitae.emr.services;

import com.invitae.emr.models.LabOrder;
import com.invitae.emr.models.Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides services for processing lab orders.
 */
public class OrderProcessing {
    /**
     * List of test panel codes we offer at our lab
     */
    private static final String[] testCatalog = new String[]{
            "PR60515",
            "PR60662",
            "PR61987",
            "PR72558",
            "PR74556",
            "PR81780",
            "PR82363",
    };

    /**
     * Practices we accept orders from
     */
    private static final List<Practice> practices = new ArrayList<>();

    public static void addPractices(List<Practice> newPractices) {
        practices.addAll(newPractices);
    }

    /**
     * Process and validate the given list of orders
     *
     * @param orders The orders to validate
     */
    public static void validateOrders(LabOrder[] orders) {
    }
}
