/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author gregm
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;

public class ReportGenerator {

    // ArrayList to store reports
    private ArrayList<String[]> reports;

    // Constructor to initialize the report data list
    public ReportGenerator() {
        // Initialize the reports ArrayList
        reports = new ArrayList<>();
    }

    // Method to generate feedback based on average grade
    private String generateFeedback(String avgGrade) {
        try {
            int grade = Integer.parseInt(avgGrade);

            // Generate feedback based on grade ranges
            if (grade >= 80) {
                return "Great work, you're doing amazing!";
            } else if (grade >= 70) {
                return "Good job, but there's room for improvement.";
            } else if (grade >= 50) {
                return "Needs improvement, try harder!";
            } else {
                return "You need to start studying more.";
            }
        } catch (NumberFormatException e) {
            return "Invalid grade input!";
        }
    }

    // Method to save the user's input into the reports ArrayList
    public void saveReport(String name, String email, String date, String avgGrade) {
        // Create a report with the user input and generated feedback
        String feedback = generateFeedback(avgGrade);

        // Add the report to the ArrayList
        reports.add(new String[]{name, email, date, avgGrade, feedback});
    }

    // Method to populate the JTable with the reports
    public void viewReports(JTable reportTable) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Date");
        model.addColumn("Average Grade");
        model.addColumn("Feedback");

        // Loop through the reports ArrayList and add each row to the model
        for (String[] report : reports) {
            model.addRow(report);
        }

        // Set the model for the JTable to populate it with the report data
        reportTable.setModel(model);
    }

    // Method to permanently save the reports to a text file
    public void saveReportsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reports.txt", false))) { // Use false to overwrite the file
            // Loop through the reports and write each report to the file
            for (String[] report : reports) {
                // Write the report fields as comma-separated values
                bw.write(String.join(",", report));
                bw.newLine();
            }
            System.out.println("Reports saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving reports to file: " + e.getMessage());
        }
    }
}
