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

    public Administrator(String name, String email, String password, int id) {//start constructor for admins obj
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }//end administrator

    public static void createAdmins() {//create admins method that is called upon when the login page jframe is called upon, i put it in the jframes constructor
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
    public static boolean AdminLogin(String email, String password) {//login method for the admin 
        for (int x = 0; x < adminList.size();x++){//for loop for the length of the admins arraylist, increment through the entire array to check//changed to x for improved readibility as i tend to get confused with the [i] index
            if (email.matches(email) && password.matches(password)) {//to check if the entered info ("email","password) match those in the arraylist
                return true;//return boolean as true
            }//end if condition
        }//end for loop
        return false;//otherwise return the boolean as false
    }//ene method
   //----------------------------------------------------------------------------------------------
}
