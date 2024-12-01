 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author gregm
 */
import java.util.ArrayList;

public class Administrator {

    private String name;
    private String email;
    private String password;
    private int id;

    private static ArrayList<Administrator> adminList = new ArrayList<>();

    public Administrator(String name, String email, String password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    // Static method to populate the admin list
    public static void createAdmins() {
        adminList.add(new Administrator("Jacob Williams", "JacobWilliams@gmail.com", "Dogs1234", 198));
        adminList.add(new Administrator("Peter Jacobson", "PeterJacobson@gmail.com", "Cats234345", 2));
        adminList.add(new Administrator("Anna White", "AnnaWhite@gmail.com", "HelloWorld3456", 3));
        adminList.add(new Administrator("Sophie Blank", "SophieBlank@gmail.com", "Password4567", 4));
        adminList.add(new Administrator("Fiona Clark", "FionaClark@gmail.com", "UnkownOcean5678", 5));
        adminList.add(new Administrator("Jack Adams", "JackAdams@gmail.com", "Ali6789", 6));
    }

    public static ArrayList<Administrator> getAdmins() {
        return adminList;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
    
    public static boolean loginAdmin(String email, String password) {
        for (Administrator admin : adminList) {
            if (admin.getEmail().equals(email) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
