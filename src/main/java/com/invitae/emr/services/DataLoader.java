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
    /**
     * Loads various sample data from CSV files
     *
     * @return A SampleData object
     */
    public static SampleData loadSampleData() throws IOException {
        final var patientCsvFile = "./data/csv/patients.csv";
        final var patients = loadFromCsv(patientCsvFile, PatientCsv.class, PatientCsv::toPatient);

        final var providerCsvFile = "./data/csv/providers.csv";
        final var providers = loadFromCsv(providerCsvFile, ProviderCsv.class, ProviderCsv::toProvider);

        final var organizationCsvFile = "./data/csv/organizations.csv";
        final var practices = loadFromCsv(organizationCsvFile, Organization.class, Organization::toPractice);
        OrderProcessing.addPractices(practices);

        final var encountersCsvFile = "./data/csv/encounters.csv";
        final var visits = loadFromCsv(encountersCsvFile, Encounter.class,
                encounter -> encounter.toVisit(patients, practices, providers));

        final var proceduresCsvFile = "./data/csv/procedures.csv";
        final var labOrders = loadFromCsv(proceduresCsvFile, Procedure.class,
                procedure -> procedure.toLabOrder(patients, visits));

        System.out.println("Sample data have been loaded.");

        return new SampleData(patients, providers, practices, visits, labOrders);
    }

    private static <T, R> List<R> loadFromCsv(String filename, Class<T> type,
                                              Function<T, R> mapper) throws IOException {
        final var fileReader = new FileReader(filename);
        final var csvBuilder = new CsvToBeanBuilder<T>(fileReader);

        final var records = csvBuilder
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
