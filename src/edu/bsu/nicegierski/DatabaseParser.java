package edu.bsu.nicegierski;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DatabaseParser {


        private static final String csvFile = "resources/fullFall2017.csv";

        public void parseDatabase(String csvFile) throws IOException {
            Reader reader = Files.newBufferedReader(Paths.get(csvFile));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.RFC4180
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                String subject = csvRecord.get("subject");
                String courseNumber = csvRecord.get("coursenumber");
                String crn = csvRecord.get("crn");
                System.out.printf("Subject: %s Course Number: %s CRN: %s\n", subject, courseNumber, crn);
            }

        }




}
