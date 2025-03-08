package com.tit.day01csvhandling.basicproblem.readcsvfileandprintdata;


public class Main {
    public static void main(String[] args) {
        // Create a CSVReader object
        CSVReader reader = new CSVReader();
        // Specify the file path
        String filePath = "src/main/resources/Students.csv";
        // Call the method to read and print CSV data
        reader.readCSV(filePath);
    }
}
