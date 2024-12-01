/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author gregory mitchell, created and linked by gregory
 */
import javax.swing.table.DefaultTableModel;//immport libraries
import javax.swing.*;//needed for jtable population
import java.util.ArrayList;//neccasary for the array list of reports
import java.io.*;//neccesary for reading and writing from a file

public class ReportGenerator extends Administrator {//start class//showing inheritance could now add functionality for admin tools!

    private ArrayList<String[]> report;//private array list for reports

    public ReportGenerator() {//constrcutore for the report generator obj
        report = new ArrayList<>();//create the report arraylist
    }//end constructor

    private String chooseFeedbackReport(String avgGrade) {//method in order to generate Feedback in the report based on the end users avg grade
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
            return "Grade input is incorrect please only enter a number!";//notify the end user of their mistake
        }//end catch
    }//end method

    public void addReport(String name, String email, String date, String avgGrade) {//method for saving the report and adding it to the array list, taking in the entered user input via the gui
        String feedback = chooseFeedbackReport(avgGrade);//getting the feedback based on their avg grade
        report.add(new String[]{name, email, date, avgGrade, feedback});//adding user input to the array list
    }//end method

    public void PopulateReportsTBL(JTable reportTBL) {//method to populate the reportTBL with reports
        DefaultTableModel table = new DefaultTableModel();//using the defaulttablemodel to populate the table in the GUI
        table.addColumn("Name");//adding the name as column
        table.addColumn("Email");//adding the email as column
        table.addColumn("Date");//adding the date as column
        table.addColumn("Average Grade");//adding the avg grade as column
        table.addColumn("Feedback");//adding the chosen feedbacl as column

        for (int x = 0; x < report.size(); x++) {//int x loops through the length/size of the array list
            table.addRow(report.get(x));//add row, getting the index from reports arraylist
        }//end for loop

        reportTBL.setModel(table);//sending the table to the reportTBL in the GUI
    }

    public void WriteReport() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reportsFile.txt", false))) { // using buffered bw object to write to a file callde ReportsFIle.txt
            for (int x = 0; x < report.size(); x++) {//for loop for the length of the reports array list
                bw.write(String.join(",", report.get(x)));//write the index of the array list to a file
                bw.newLine();//adds line after break
                bw.flush();//ending and signing finsishing
            }
            System.out.println("Reports saved to file successfully.");//notify the end user the reports have been saved sucesfully
        } catch (IOException e) {//catch for error handling
            System.out.println("Error saving reports to file: " + e.getMessage());//aout to notify the end uaer there was errors saving reports to the file
        }//end catch
    }//end save Report To a File Method
}//end class
