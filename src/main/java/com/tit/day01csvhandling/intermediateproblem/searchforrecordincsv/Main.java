package com.tit.day01csvhandling.intermediateproblem.searchforrecordincsv;


public class Main {
    public static void main(String[] args) {
        // Create a CSVSearcher object
        CSVSearcher searcher = new CSVSearcher();
        // Specify the file path
        String filePath = "src/main/resources/Employees.csv";
        // Specify the employee name to search for
        String employeeName = "Jane Smith";
        // Call the method to search for the employee and print their department and salary
        searcher.searchEmployee(filePath, employeeName);
    }
}
