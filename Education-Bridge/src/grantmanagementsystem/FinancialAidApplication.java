package grantmanagementsystem;

import java.io.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FinancialAidApplication {
    private static final String APPLICATIONS_FILE = "applications.txt";
    
    static {
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
    
    // Save new application
    public static void submitApplication(String studentId, String name, String course, String email, String amount, String reason) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(APPLICATIONS_FILE, true))) {
            String status = "PENDING";
            String date = LocalDate.now().toString();
            writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s", studentId, name, course, email, amount, reason, status, date));
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Application submitted successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error submitting application: " + e.getMessage());
        }
    }
    
    // View your own applications
    public static void loadMyApplications(JTable table, String studentId) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(APPLICATIONS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(studentId)) {
                    model.addRow(data);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading applications: " + e.getMessage());
        }
    }
}
