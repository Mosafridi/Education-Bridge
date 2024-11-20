/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sponsorship {
    private static final String SPONSOR_FILE = "sponsors.txt";
    private static final String APPLICATIONS_FILE = "applications.txt";
    
    static {
        createFileIfNotExists(SPONSOR_FILE);
        createFileIfNotExists(APPLICATIONS_FILE);
    }
    
    private static void createFileIfNotExists(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating file " + fileName + ": " + e.getMessage());
        }
    }
    
    public static void saveSponsor(String sponsorId, String name, String funds) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SPONSOR_FILE, true))) {
            writer.write(String.format("%s,%s,%s", sponsorId, name, funds));
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Sponsor registered successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving sponsor: " + e.getMessage());
        }
    }
    
    public static void loadSponsors(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(SPONSOR_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading sponsors: " + e.getMessage());
        }
    }
 
    
    // Updated updateApplicationStatus method
    public static void updateApplicationStatus(String studentId, String newStatus) {
        ArrayList<String> lines = new ArrayList<>();
        boolean found = false;
        String[] applicationData = null;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(APPLICATIONS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(studentId)) {
                    data[6] = newStatus; // Update status (index changed due to new fields)
                    found = true;
                    applicationData = data;
                }
                lines.add(String.join(",", data));
            }
            
            if (found) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(APPLICATIONS_FILE))) {
                    for (String updatedLine : lines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    
                    if (newStatus.equals("APPROVED")) {
                        // Save grant with all required fields
                        Grant.saveGrant(applicationData[0], applicationData[1], 
                                      applicationData[2], applicationData[3], 
                                      applicationData[4], "SP001");
                    }
                    
                    JOptionPane.showMessageDialog(null, "Application " + newStatus.toLowerCase() + " successfully!");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating application: " + e.getMessage());
        }
    }
}
