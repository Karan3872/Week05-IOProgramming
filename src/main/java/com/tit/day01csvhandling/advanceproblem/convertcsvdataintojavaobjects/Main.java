package com.tit.day01csvhandling.advanceproblem.convertcsvdataintojavaobjects;

import java.util.List;

// Creating a class Main to execute the main method
public class Main {
    public static void main(String[] args) {
        // Create a CSVToJavaObjectsConverter object
        CSVToJavaObjectsConverter converter = new CSVToJavaObjectsConverter();
        // Specify the file path
        String filePath = "src/main/resources/Students.csv";
        // Call the method to read and convert CSV data to list of Student objects
        List<Student> students = converter.readCSVAndConvert(filePath);
        // Print the list of Student objects
        for (Student student : students) {
            System.out.println(student);
        }
    }
}