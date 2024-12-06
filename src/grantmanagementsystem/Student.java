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
public static boolean StudentLogin(String email, String password) {
    for (int x = 0; x < student.length; x++) {
        if (student[x] != null) {  // Ensure the student object is not null
            if (email.equals(student[x].getEmail()) && password.equals(student[x].getPassword())) {
                return true;  // Return true if credentials match
            }
        }
    }
    return false;  // Return false if no match is found
}
    //--------------------------------------------------------------------------------------
}//end class
