/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author gregory mitchell
 */

import javax.swing.table.DefaultTableModel;//immport libraries
import javax.swing.*;//needed for jtable population
import java.util.ArrayList;//neccasary for the array list of reports
import java.io.*;//neccesary for reading and writing from a file

public class ReportGenerator {//start class

    private ArrayList<String[]> reports;//private array list for reports

    public ReportGenerator() {//constrcutore for the report generator obj
        reports = new ArrayList<>();//create the report arraylist
    }//end constructor

    private String generateFeedback(String avgGrade) {//method in order to generate Feedback in the report based on the end users avg grade
        try {//try catch for error handling
            int average = Integer.parseInt(avgGrade);//parse the avg grade to average 

            if (average >= 80) {//if the users average grade was equal to or above 80
                return "Wow, Doing Great!";//set the feedbackk to :
            } else if (average >= 70) {//if the users average grade was equal to or above 70
                return "You can do better!.";//return this feedback:
            } else if (average >= 50) {//if the users average grade was equal to or above 50
                return "Barely passed, need to try more!";//return this feedback:
            } else {//else if anything lower
                return "You may need to try harder.";//return this feedback:
            }
        } catch (NumberFormatException e) {//catch an errors with the user input
            return "Invalid grade input!";//notify the end user of their mistake
        }//end catch
    }//end method

    public void saveReport(String name, String email, String date, String avgGrade) {//method for saving the report and adding it to the array list, taking in the entered user input via the gui
        String feedback = generateFeedback(avgGrade);//getting the feedback based on their avg grade
        reports.add(new String[]{name, email, date, avgGrade, feedback});//adding user input to the array list
    }//end method

    public void viewReports(JTable reportTBL) {//method to populate the reportTBL with reports
        DefaultTableModel table = new DefaultTableModel();//using the defaulttablemodel to populate the table in the GUI
        table.addColumn("Name");//adding the name as column
        table.addColumn("Email");//adding the email as column
        table.addColumn("Date");//adding the date as column
        table.addColumn("Average Grade");//adding the avg grade as column
        table.addColumn("Feedback");//adding the chosen feedbacl as column

        for (String[] report : reports) {
            table.addRow(report);
        }

        reportTBL.setModel(table);
    }

    public void saveReportsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reports.txt", false))) { // Use false to overwrite the file
            for (String[] report : reports) {
                bw.write(String.join(",", report));
                bw.newLine();
            }
            System.out.println("Reports saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving reports to file: " + e.getMessage());
        }
    }
}
