/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;
//gregory mitchell
/**
 *
 * @author Gregory Mitchell
 */
import java.awt.Desktop;//import for the url
import java.io.*;//import to save file
import javax.swing.JTable;//import to help populate the table
import javax.swing.JOptionPane;//import for the gui popups
import javax.swing.table.DefaultTableModel;
import java.net.URI;//import for the url

public class ResourceHub {//start ResourceHub class

    private final String txt = "Resources.txt";//declaring string for resources.txt

    public void saveResource(String firstname, String surname, String Course, String Date, String resourceType, String URL) {//save resources method, stuff will be sent from the fields when the button is pressed as arguments, as you can see im adding in 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txt, true))) {// buffered writer obj called bw,this will be used to add to a file named txt, wrapped in a try catch
            bw.write(firstname + "," + surname + "," + Course + "," + Date + "," + resourceType + "," + URL);//writing this data to a file using bw
            bw.newLine();//adds line after break
            bw.flush();//ending and signing finsishing 
            System.out.println("Added to the file succesfully");//notify the end user that is was succesfully added to the file
        } catch (IOException e) {//if something went wrong along the way it will be caught here
            System.out.println("Exception: " + e.getMessage());//notify the end user something went wrong
        }
    }

    public void loadResources(JTable ResourceTBL) {//reverted back to my old way of loading the txt file into the table, i was going to try to load the txt file (resouces) to a array list but i just couldnt get it to work
        File txt = new File("Resources.txt");//file obj for new file named txt 

        if (txt.exists()) {//if the txt exists
            try {//try 
                if (txt.createNewFile()) {// create a new file
                    System.out.println("Made successfully");//notifying the end user it was made succesfully
                } else {//else if
                    System.out.println("failed to create the file.");//notify the end user it failed
                }
            } catch (IOException e) {//catch with IOException e
                System.out.println("Error making file, or file was already made!: " + e.getMessage());//notify the end user
            }//end catch
        }//end original if condition

        DefaultTableModel table = (DefaultTableModel) ResourceTBL.getModel();//getting the 
        table.setRowCount(0); // remove existing rows

        try (BufferedReader br = new BufferedReader(new FileReader(txt))) {//creating buffered reader to reade the txt file
            String ln;//each line for buffered reader, to readfrom the file
            while ((ln = br.readLine()) != null) {//while until the end is reached
                String[] row = ln.split(",");//breaking line into sections using comma , to seperate them

                if (row.length == table.getColumnCount()) {//ensure it matches the epected count of columns in the table
                    table.addRow(row);//add a row if not
                } else {//else if
                    JOptionPane.showMessageDialog(null,
                            "Encountered an Error! The number of resources and rows within the table must not be aligned.",
                            "Error related to data",
                            JOptionPane.ERROR_MESSAGE);//display as an error message
                    break;//break
                }//end else if
            }//end while loop
        } catch (IOException e) {//ccatch here if something went wrong
            System.out.println("Unfortuneatly we encountered an error loading the file: " + e.getMessage());//ntify the end user
        }//end catch
    }//end load resurces method

    public void ContactUs(String firstname, String surname, String gmail, String dateReview, String content) {//method to save the feedback entered into the contact us form.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("contact.txt", true))) {//creat bufffered writer to write to a file, linked contact.txt
            // Write user input to file with comma separation
            bw.write(firstname + "," + surname + "," + gmail + "," + dateReview + "," + content);//writing this data to a file using bw
            bw.newLine();//adds line after break
            bw.flush();//ending and signing finsishing
            System.out.println("Added to the file succesfully");//notify the end user that is was succesfully added to the file
        } catch (IOException e) {//catch with IOException e
            System.out.println("Exception: " + e.getMessage());//notify the user it went astray along the way
        }
    }//end method

    public static void Tutorial1() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=jhDUxynEQRI"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception e) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + e.getMessage());//sout to notify the end user there was a error encountered opening the link
        }//end catch for error handling
    }//end method

    public static void Tutorial2() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=K1iu1kXkVoA"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception e) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + e.getMessage());
        }//end catch for error handling
    }//end method

    public static void Tutorial3() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=tj5sLSFjVj4"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception e) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + e.getMessage());
        }//end catch for error handling
    }//end method

    public static void Tutorial4() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=vKVzRbsMnTQ"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception e) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + e.getMessage());
        }//end catch for error handling
    }//end method

    public static void Tutorial5() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=QvHBHuuddYk"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception e) {//catch if somethign wenr wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + e.getMessage());
        }//end catch for error handling
    }//end method

}//end class
