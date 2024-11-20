package grantmanagementsystem;

import java.io.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grant {
    private static final String GRANT_FILE = "grants.txt";
    private static final String APPLICATIONS_FILE = "applications.txt";
    
    static {
        createFileIfNotExists(GRANT_FILE);
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
    
    // Updated loadApplicationsToTable method
    public static void loadApplicationsToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(APPLICATIONS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading applications: " + e.getMessage());
        }
    }
    
    // Updated saveGrant method
    public static void saveGrant(String studentId, String name, String course, String email, 
                               String amount, String sponsorId) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(GRANT_FILE, true))) {
            String date = LocalDate.now().toString();
            writer.write(String.format("%s,%s,%s,%s,%s,%s,%s", 
                studentId, name, course, email, amount, sponsorId, date));
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Grant approved and saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving grant: " + e.getMessage());
        }
    }
    
    // Updated loadGrantsToTable method
    public static void loadGrantsToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(GRANT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading grants: " + e.getMessage());
        }
    }
}
