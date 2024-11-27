package grantmanagementsystem;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ResourceHub {

    private final String txt = "Resources.txt";

    public void saveResource(String fName, String sName, String resourceCourse, String resourceDate, String resourceType, String resourceURL) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txt, true))) {
            bw.write(fName + "," + sName + "," + resourceCourse + "," + resourceDate + "," + resourceType + "," + resourceURL);
            bw.newLine();
            bw.flush();
            System.out.println("Successfully added to the file.");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());//Small change for commit
        }
    }

public void loadResources(JTable ResourceTBL) {//reverted back to my old way of loading the txt file into the table, i was going to try to load the txt file (resouces) to a array list but i just couldnt get it to work
    File inFile = new File("Resources.txt");

    if (inFile.exists()) {
        try {
            if (inFile.createNewFile()) {
                System.out.println("Created successfully");
            } else {
                System.out.println("failed to create the file.");
            }
        } catch (IOException e) {
            System.out.println("Error making file: " + e.getMessage());
        }
    }

    DefaultTableModel table = (DefaultTableModel) ResourceTBL.getModel(); 
    table.setRowCount(0); // Clear any existing rows

    try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
        String ln;
        while ((ln = br.readLine()) != null) {
            String[] row = ln.split(",");

            if (row.length == table.getColumnCount()) {
                table.addRow(row);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Error! The resources and rows within the table must not be aligned properly.",
                        "Data Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    } catch (IOException e) {
           System.out.println("Error loading file: " + e.getMessage());
    }
}


    public void linkTutorials() {

    }

    public void checkQuizAnswers() {

    }

    public void saveFolder() {// potentially ask the end user to add a folder, will figure our how difficult this is going to be

    }

    public void method() {

    }

}
