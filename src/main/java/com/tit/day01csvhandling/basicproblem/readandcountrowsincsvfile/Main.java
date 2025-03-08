package com.tit.day01csvhandling.basicproblem.readandcountrowsincsvfile;

public class Main {
    public static void main(String[] args) {
        // Create a CSVRowCounter object
        CSVRowCounter counter = new CSVRowCounter();
        // Specify the file path
        String filePath = "src/main/resources/Students.csv";
        // Call the method to count rows in the CSV file
        int rowCount = counter.countRows(filePath);
        // Print the row count
        System.out.println("Number of records (excluding header): " + rowCount);
    }
}