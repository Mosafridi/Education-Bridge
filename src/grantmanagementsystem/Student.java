/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author karawan
 */
public class Student {

    private String name, email, password;

    private int id;

    public Student(String name, String email, String password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public static Student[] student = new Student[6];

    public static void createStudent() {
        student[0] = new Student("joe adams", "michael@gmail.com", "235", 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //--------Gregory added this for the login functionality----------------------------------------------------------------

    public static boolean StudentLogin(String email, String password) {//login method for the student 
        for (int x = 0; x < student.length; x++) {//for loop for the length of the student array, increment through the entire array to check
            if (email.matches(email) && password.matches(password)) {//to check if the entered info ("email","password) match those in the array
                return true;//return the boolean as true 
            }//end if condition
        }//end for loop
        return false;//return boolean as false
    }//end method
    //--------------------------------------------------------------------------------------
}//end class
