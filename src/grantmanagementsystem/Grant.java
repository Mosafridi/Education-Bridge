package grantmanagementsystem;
//author Shoaib Mohammad
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class Grant {
    // Method to load applications into the table
    public static void loadApplicationsToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try (BufferedReader reader = new BufferedReader(new FileReader("applications.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);  // Add the row to the table
            }
        } catch (IOException e) {
            System.err.println("Error loading applications: " + e.getMessage());
        }
    }

    // Method to save grant application data (after approval)
    public static void saveGrant(String studentId, String studentName, String course, String email, String amount, String sponsorId) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("approved_grants.txt", true))) {
            writer.write(studentId + "," + studentName + "," + course + "," + email + "," + amount + "," + sponsorId + ",APPROVED");
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving grant: " + e.getMessage());
        }
    }

    // Method to load grant applications to the table
    public static void loadGrantsToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try (BufferedReader reader = new BufferedReader(new FileReader("approved_grants.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);  // Add the row to the table
            }
        } catch (IOException e) {
            System.err.println("Error loading grants: " + e.getMessage());
        }
    }
}
