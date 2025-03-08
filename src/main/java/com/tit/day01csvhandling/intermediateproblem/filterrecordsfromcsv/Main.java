package com.tit.day01csvhandling.intermediateproblem.filterrecordsfromcsv;


public class Main {
    public static void main(String[] args) {
        // Create a CSVFilter object
        CSVFilter filter = new CSVFilter();
        // Specify the file path
        String filePath = "src/main/resources/Students.csv";
        // Call the method to filter and print CSV data
        filter.filterCSV(filePath);
    }
}
