/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

import java.util.ArrayList;
/**
 *
 * @author karawan
 */
public class Student {

    private static ArrayList<Student> studentList = new ArrayList<>();

    // Constructor and other methods...
    public static ArrayList<Student> getStudentList() {
        return studentList;
    }
    private String name, email, password;
    private int id;

    // Constructor
    public Student(String name, String email, String password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    // Static array for login functionality
    public static Student[] student = new Student[6];

    // Static ArrayList for dynamic management
    private static ArrayList<Student> studentsList = new ArrayList<>();

    // Initialize the static array and ArrayList with the same data
    public static void createStudent() {
        student[0] = new Student("joe adansms", "ans@gmail.com", "235", 1);
        student[1] = new Student("jka adsnxams", "nxma@gmail.com", "235", 9);
        student[2] = new Student("sjd adamns", "akx@gmail.com", "235", 2);
        student[3] = new Student("sksd adamssbd", "kx@gmail.com", "235", 8);
        student[4] = new Student("kskx adamsoxs", "nabx@gmail.com", "235", 3);

        // Populate the ArrayList with the same data
        for (Student s : student) {
            if (s != null) {
                studentsList.add(s);
            }
        }
    }

    // Add a new student dynamically
    public static void addStudent(String name, String email, String password, int id) {
        studentsList.add(new Student(name, email, password, id));
    }

    // Remove a student dynamically by index
    public static boolean deleteStudent(int index) {
        if (index >= 0 && index < studentsList.size()) {
            studentsList.remove(index);
            return true;
        }
        return false; // Invalid index
    }

//    // Get the ArrayList of students
//    public static ArrayList<Student> getStudentsList() {
//        return studentsList;
//    }
    
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
    public static boolean StudentLoginCheck(String entemail, String entpassword) {//check the student login
        for (int x = 0; x < student.length; x++) {//for loop the length of the array
            if (student[x] != null) {  // if the array index is not null
                if (entemail.equals(student[x].getEmail()) && entpassword.equals(student[x].getPassword())) {//and nested if to see and also if the entered credentials match any of those in the array
                    return true;  // Return true if they do indeed match
                }//end if condition
            }//end if condition
        }//end for loop
        return false;  // Return false if nothign was found in the check
    }

    public static void showLoginMessage(String email) {//a method to show the login method and demonstrate method overloading using polymorphism
        System.out.println("Welcome Student: " + email + ". You have student access.");//sout to notify the end user what privelledges they may have
    }//end show login message method

    public static void showLoginMessage(boolean loginSuccess) {//another show login message but with different argument passed in
        if (loginSuccess) {//if the login was a success
            System.out.println("You have been logged in!");//sout to notify the end user that they have succesfully been logged in
        } else {//else condition
            System.out.println("The entered credentials didnt match an existing account please try again.");//sout to notify the end user their login failed
        }//end else condition
    }//end method

    //--------------------------------------------------------------------------------------
}//end class
