package com.invitae.emr.services;

import com.invitae.emr.models.Address;
import com.invitae.emr.models.LabOrder;
import com.invitae.emr.models.Practice;

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
    private static final Practice[] practices = new Practice[]{
            new Practice(
                    "Kaiser Washington",
                    new Address("100 State St.", "Tacoma", "WA", "97562", "US"),
                    "153"),
            new Practice(
                    "SSM Health WI",
                    new Address("789 Glacier Road", "Madison", "WI", "52441", "US"),
                    "960"),
            new Practice(
                    "Stanford Medical Center",
                    new Address("300 Pasteur Drive", "Palo Alto", "CA", "94300", "US"),
                    "234"),
    };

    /**
     * Process and validate the given list of orders
     *
     * @param orders The orders to validate
     */
    public static void validateOrders(LabOrder[] orders) {
    }
}
