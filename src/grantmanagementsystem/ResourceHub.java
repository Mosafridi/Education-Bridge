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

public class ResourceHub extends Administrator{//start ResourceHub class//showing inheritance could now add functionality for admin tools!
     public ResourceHub(){
    
     }

    private final String txt = "Resources.txt";//declaring string for resources.txt
    
    public void saveResourceToFile(String firstname, String surname, String Course, String Date, String resourceType, String URL) {//save resources method, stuff will be sent from the fields when the button is pressed as arguments, as you can see im adding in 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txt, true))) {// buffered writer obj called bw,this will be used to add to a file named txt, wrapped in a try catch
            bw.write(firstname + "," + surname + "," + Course + "," + Date + "," + resourceType + "," + URL);//writing this data to a file using bw
            bw.newLine();//adds line after break
            bw.flush();//ending and signing finsishing 
            System.out.println("That was a success! Added to the file nicely!");//notify the end user that is was succesfully added to the file
        } catch (IOException ex) {//if something went wrong along the way it will be caught here
            System.out.println("We encountered an error! Exception: " + ex.getMessage());//notify the end user something went wrong
        }//end catch
    }//end save resoruces methods

    public void PopulateRescourecTBL(JTable ResourceTBL) {//reverted back to my old way of loading the txt file into the table, i was going to try to load the txt file (resouces) to a array list but i just couldnt get it to work
        File txt = new File("Resources.txt");//file obj for new file named txt 

        if (txt.exists()) {//if the txt exists
            try {//try 
                if (txt.createNewFile()) {// create a new file
                    System.out.println("Sucessfully created the txt file to store data!");//notifying the end user it was made succesfully
                } else {//else if
                    System.out.println("Encountered an error creating the file.");//notify the end user it failed
                }
            } catch (IOException ex) {//catch with IOException e
                System.out.println("Error encountered when making the file, or file was already made!: " + ex.getMessage());//notify the end user
            }//end catch
        }//end original if condition

        DefaultTableModel table = (DefaultTableModel) ResourceTBL.getModel();//getting the 
        table.setRowCount(0); // remove existing rows

        try (BufferedReader br = new BufferedReader(new FileReader(txt))) {//creating buffered reader to reade the txt file
            String line;//each line for buffered reader, to readfrom the file
            while ((line = br.readLine()) != null) {//while until the end is reached
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

    public void SaveEndUserFeedback(String firstname, String surname, String gmail, String dateReview, String content) {//method to save the feedback entered into the contact us form.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("contact.txt", true))) {//creat bufffered writer to write to a file, linked contact.txt
            // Write user input to file with comma separation
            bw.write(firstname + "," + surname + "," + gmail + "," + dateReview + "," + content);//writing this data to a file using bw
            bw.newLine();//adds line after break
            bw.flush();//ending and signing finsishing
            System.out.println("Sucessfully written to the file and stored for review! Please give our team 1-3 business days!");//notify the end user that is was succesfully added to the file
        } catch (IOException ex) {//catch with IOException e
            System.out.println("We encounters an error writing the user feedback to the file. Exception: " + ex.getMessage());//notify the user it went astray along the way
        }//end catch
    }//end method

    public static void ConnectingTutorial1() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=jhDUxynEQRI"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception ex) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + ex.getMessage());//sout to notify the end user there was a error encountered opening the link
        }//end catch for error handling
    }//end method

    public static void ConnectingTutorial2() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=K1iu1kXkVoA"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception ex) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + ex.getMessage());
        }//end catch for error handling
    }//end method

    public static void ConnectingTutorial3() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=tj5sLSFjVj4"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception ex) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + ex.getMessage());
        }//end catch for error handling
    }//end method

    public static void ConnectingTutorial4() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=vKVzRbsMnTQ"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception ex) {//catch if somethign went wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + ex.getMessage());
        }//end catch for error handling
    }//end method

    public static void ConnectingTutorial5() {//method to link tutorials to labels within the GUI educational enviorment
        try {// start try
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=QvHBHuuddYk"));//linking youtube tutorial to the GUI labels, ive chosen a youtuber i watch a bit in my spar time as his videos are both entertaining and educations, will reference his channel in the write up
        } catch (Exception ex) {//catch if somethign wenr wrong so program doesnt catch
            System.out.println("Error encountered when opening link: " + ex.getMessage());
        }//end catch for error handling
    }//end method

}//end class
