package com.tit.day01csvhandling.basicproblem.writedatatocsvfile;

public class Main {
    public static void main(String[] args) {
        // Create an EmployeeWriter object
        EmployeeWriter writer = new EmployeeWriter();
        // Specify the file path
        String filePath = "src/main/resources/Employees.csv";
        // Call the method to write employee details to the CSV file
        writer.writeCSV(filePath);
    }
}