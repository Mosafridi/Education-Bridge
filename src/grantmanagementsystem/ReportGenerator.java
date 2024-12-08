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

public class ReportGenerator extends Administrator {//start report generator class here, i generate feedback in the jframe itself and colour the entered grade depending on the entered grade//extending to show inheritance, could be used in the future to add extra functionality for admins not accesible by students

    public ReportGenerator() {//create empty constructor for user input and extending to admin class
        // Constructor
    }//end constructor

    public void saveReport(String enteredName, String enteredEmail, String enteredDate, String AverageEnteredGrade) {//method to write the report to a file
        String reporttxt = "ReportFile.txt";//assinging the path to a string

        try (BufferedWriter bufferedWrirter = new BufferedWriter(new FileWriter(reporttxt, true))) {// buffered writer obj called bw,this will be used to add to a file named txt, wrapped in a try catch
            bufferedWrirter.write(enteredName + "," + enteredEmail + "," + enteredDate + "," + AverageEnteredGrade);//writing this data to a file using bw
            bufferedWrirter.newLine();//adds line after break
            bufferedWrirter.flush();//ending and signing finsishing 
            System.out.println("Succesfully saved to a file, click the view button to populate the button and check!");//sout to notify the end user
        } catch (IOException ex) {//catch exception and notify the end user
            System.out.println("We ran into a fault (error) someewere in the process " + ex.getMessage());//sout to notify the end user
        }//end catch
    }//end write report method

    public void PopulateReportTBL(JTable ReportTBL) { //method to populate the table with the reports
        File reporttxt = new File("ReportFile.txt");//assign the file path to file to reporttxt, routing to the reports were the reports are saved

        DefaultTableModel table = (DefaultTableModel) ReportTBL.getModel();//getting the report model
        table.setRowCount(0);// remove existing rows

   try (BufferedReader bufferedReader = new BufferedReader(new FileReader(reporttxt))) {//creating buffered reader to reade the txt file
            String line;//each line for buffered reader, to readfrom the file
            while ((line = bufferedReader.readLine()) != null) {//while until the end is reached
                String[] row = line.split(",");//breaking line into sections using comma , to seperate them

                if (row.length == table.getColumnCount()) {//ensure it matches the epected count of columns in the table
                    table.addRow(row);//add a row if not
                } else {//else if
                    JOptionPane.showMessageDialog(null,
                            "Encountered an Error! The number of resources and rows within the table must not match up.",
                            "Error related to data",
                            JOptionPane.ERROR_MESSAGE);//display as an error message
                    break;//break
                }//end else if
            }//end while loop
        } catch (IOException ex) {//ccatch here if something went wrong
            System.out.println("Unfortuneatly we encountered an error loading the requested file: " + ex.getMessage());//ntify the end user
        }//end catch
    }//end load resurces method
}
