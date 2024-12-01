/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author gregm
 */
public class Administrator {//declaring variables
    private String name;
    private String email;
    private String password;
    private int id;

    // Constructor   

    public Administrator(String name, String email, String password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }


    public static Administrator[] admin = new Administrator[6];//creating 6 accounts

    private static void createAdmins() {//start create user//method to create all users in the array

        admin[0] = new Administrator("Jacob Williams", "JacobWilliams@gmail.com", "Dogs1234", 198);
        admin[1] = new Administrator("Peter Jacobson", "PeterJacobson@gmail.com", "Cats234345", 2);
        admin[2] = new Administrator("Anna White", "AnnaWhite@gmail.com", "HelloWorld3456", 3);
        admin[3] = new Administrator("Sophie Blank", "SophieBlank@gmail.com", "Password4567", 4);
        admin[4] = new Administrator("Fiona Clark", "FionaClark@gmail.com", "UnkownOcean5678", 5);
        admin[5] = new Administrator("Jack Adams", "JackAdams@gmail.com", "Ali6789", 6);

    }//end 
   
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public static Administrator[] getAdmin() {
        return admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setAdmins(Administrator[] admins) {
        Administrator.admin = admins;
    }
    
    
    
}
