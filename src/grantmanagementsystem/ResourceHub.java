package grantmanagementsystem;

import java.io.*;
import java.util.ArrayList;

public class ResourceHub {

    private final String fileName = "Resources.txt";

    public void saveResource(String fName, String sName, String resourceCourse, String resourceDate, String resourceType, String resourceURL) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(fName + "," + sName + "," + resourceCourse + "," + resourceDate + "," + resourceType + "," + resourceURL);
            bw.newLine();
            bw.flush();
            System.out.println("Successfully added to the file.");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());//Small change for commit
        }
    }

    public ArrayList<String[]> loadRecources() {
        ArrayList<String[]> resources = new ArrayList<>();
        File inFile = new File(fileName);

        if (!inFile.exists()) {
            try {
               if (!inFile.createNewFile()) {
                    System.out.println("Created succesfully");
                } else {
                    System.out.println("failed to create the file.");
                }
            } catch (IOException e) {
                System.out.println("Error making file: " + e.getMessage());
            }
        
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String ln;
            while ((ln = br.readLine()) != null) {
                String[] row = ln.split(",");
                resources.add(row);
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        return resources;
    }
        return null;
    }
    
    public void linkTutorials(){
        
    }
    
    public void checkQuizAnswers(){
        
    }
    
    public void saveFolder(){// potentially ask the end user to add a folder, will figure our how difficult this is going to be
        
    }
    
    public void method(){
        
    }
    
}
