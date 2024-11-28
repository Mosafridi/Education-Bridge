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
    private String password;
    private int id;
    private int permissionsLevel;

    // Constructor   

    public Administrator(String name, String password, int id, int permissionsLevel) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.permissionsLevel = permissionsLevel;
    }


    public static Administrator[] admin = new Administrator[6];//creating 6 accounts

    private static void createAdmins() {//start create user//method to create all users in the array

        admin[0] = new Administrator("Jacob Williams", "Dogs1234", 198, 5);
        admin[1] = new Administrator("Peter Jacobson", "Cats234345", 2, 4);
        admin[2] = new Administrator("Anna White", "HelloWorld3456", 3, 5);
        admin[3] = new Administrator("Sophie Blank", "Password4567", 4, 2);
        admin[4] = new Administrator("Fiona Clark", "UnkownOcean5678", 5, 1);
        admin[5] = new Administrator("Jack Adams", "Ali6789", 6, 4);

    }//end 
    
    public void permissionsfunctionality(){
        
    }

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
