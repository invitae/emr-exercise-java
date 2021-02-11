package com.invitae.emr.services;

import com.invitae.emr.models.dto.*;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Contains methods for loading sample data from files.
 */
public class DataLoader {
    public static SampleData loadSampleData() throws IOException {
        var patientCsvFile = "./data/csv/patients.csv";
        var patients = loadFromCsv(patientCsvFile, PatientCsv.class, PatientCsv::toPatient);

        var providerCsvFile = "./data/csv/providers.csv";
        var providers = loadFromCsv(providerCsvFile, ProviderCsv.class, ProviderCsv::toProvider);

        var organizationCsvFile = "./data/csv/organizations.csv";
        var practices = loadFromCsv(organizationCsvFile, Organization.class, Organization::toPractice);

        var encountersCsvFile = "./data/csv/encounters.csv";
        var appointments = loadFromCsv(encountersCsvFile, Encounter.class,
                encounter -> encounter.toAppointment(patients, practices, providers));

        var proceduresCsvFile = "./data/csv/procedures.csv";
        var labOrders = loadFromCsv(proceduresCsvFile, Procedure.class,
                procedure -> procedure.toLabOrder(patients, appointments));

        System.out.println("Sample data have been loaded.");

        return new SampleData(patients, providers, practices, appointments, labOrders);
    }

    private static <T, R> List<R> loadFromCsv(String filename, Class<T> type,
                                             Function<T, R> mapper) throws IOException {
        var fileReader = new FileReader(filename);
        var csvBuilder = new CsvToBeanBuilder<T>(fileReader);

        var records = csvBuilder
                .withType(type)
                .build()
                .parse()
                .stream()
                .map(mapper)
                .collect(Collectors.toList());

        fileReader.close();

        return records;
    }
}
