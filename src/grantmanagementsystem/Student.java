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
   private String name,email,password;
   
  private int id;

    public Student(String name, String email, String password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }
    
    public static Student[] student = new Student[6];
    
    public static void createStudent(){
        student[0]= new Student("joe adams","michael@gmail.com","235",1);
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
  public static boolean loginStudent(String email, String password) {
    for (int i = 0; i < student.length; i++) {  
        Student s = student[i];
        if (s != null && s.getEmail().equals(email) && s.getPassword().equals(password)) {
            return true; 
        }
    }
    return false;
}
  //--------------------------------------------------------------------------------------
}
