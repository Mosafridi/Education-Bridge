package grantmanagementsystem;
//author Shoaib Mohammad
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class Sponsorship {
    // Method to load sponsor data into the table
    public static void loadSponsors(JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); // Clear existing rows

    try (BufferedReader reader = new BufferedReader(new FileReader("sponsors.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            model.addRow(data);  // Add each sponsor's data to the table
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading sponsors: " + e.getMessage());
    }
}

   // Save sponsor information to a file
public static void saveSponsor(String sponsorId, String sponsorName, String funds) {
    // Format the sponsor details as a CSV string
    String sponsorDetails = sponsorId + "," + sponsorName + "," + funds;

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("sponsors.txt", true))) {
        writer.write(sponsorDetails);  // Write sponsor details to the file
        writer.newLine();  // Move to the next line
        JOptionPane.showMessageDialog(null, "Sponsor registered successfully.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error registering sponsor: " + e.getMessage());
    }
}
}