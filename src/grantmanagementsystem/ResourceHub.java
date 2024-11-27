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

}
