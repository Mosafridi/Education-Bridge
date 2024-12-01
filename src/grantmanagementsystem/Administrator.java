/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author Gregory Mitchell
 */
import java.util.ArrayList;//import array list to contain the administrator array list

public class Administrator {//start class

    private String name, email, password;//declaring variables, name email and password as strings//private forfor encapuslation
    private int id;//private integer for encapuslation

    private static ArrayList<Administrator> adminList = new ArrayList<>();//create array list for administrators
    
    public Administrator(){
    }
    
    public Administrator(String name, String email, String password, int id) {//start constructor for admins obj
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }//end administrator

    public static void createAdminsAccount() {//create admins method that is called upon when the login page jframe is called upon, i put it in the jframes constructor
        adminList.add(new Administrator("Adam White", "AW@gmail.com", "password1234", 1));//admin information being added to the array list using .add//admin obj contains name, email, password and an ID
        adminList.add(new Administrator("Paul Black", "PB@gmail.com", "Cats1234", 2));//admin obj contains name, email, password and an ID
        adminList.add(new Administrator("Johan Libre", "JL@gmail.com", "HelloWorld1", 3));//admin obj contains name, email, password and an ID
        adminList.add(new Administrator("Sean Williams", "SW@gmail.com", "Pass4567", 4));//admin obj contains name, email, password and an ID
        adminList.add(new Administrator("Fiona Shreck", "FS@gmail.com", "Forgot678", 5));//admin obj contains name, email, password and an ID
        adminList.add(new Administrator("Goku Kid", "GK@gmail.com", "Apple123", 6));//admin obj contains name, email, password and an ID
    }

    public static ArrayList<Administrator> getAdmins() {//gettter for array list of admins for encapsulation
        return adminList;
    }

    public String getName() {//get name method
        return name;
    }

    public String getEmail() {//get email method
        return email;
    }

    public String getPassword() {//get password method
        return password;
    }

    public int getId() {//get ID method
        return id;
    }

    //----------------------------------------------------------------------------------------------
public static boolean AdminLogin(String email, String password) {
    for (int x = 0; x < adminList.size(); x++) {  // Loop through the adminList
        Administrator admin = adminList.get(x);  // Get the admin object at index x

        if (email.equals(admin.getEmail()) && password.equals(admin.getPassword())) { 
            // Compare input email and password with the admin's stored email and password
            return true;  // Return true if a match is found
        }
    }
    return false;  // Return false if no match is found after looping through all admins
}

    //----------------------------------------------------------------------------------------------
}
