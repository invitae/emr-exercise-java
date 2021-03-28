package com.invitae.emr;

import com.invitae.emr.services.DataLoader;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the start of your EMR programming exercise.");

        try {
            final var sampleData = DataLoader.loadSampleData();
        } catch (Exception exception) {
            System.out.println("ERROR: failed to read from sample data files.");
            exception.printStackTrace();
        }
    }
}
