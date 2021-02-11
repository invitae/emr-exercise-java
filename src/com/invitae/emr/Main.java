package com.invitae.emr;

import com.invitae.emr.services.DataLoader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the start of your EMR programming exercise.");

        try {
            /* load sample data */
            var sampleData = DataLoader.loadSampleData();

            /* execute your tests here */
            assert sampleData.patients.size() == 10 : "Wrong number of patients.";
        } catch (IOException ioException) {
            System.out.println("ERROR: failed to read from sample data files.");
            ioException.printStackTrace();
        } catch (AssertionError assertionError) {
            System.out.println("Test failed: " + assertionError.getMessage());
        }
    }
}
