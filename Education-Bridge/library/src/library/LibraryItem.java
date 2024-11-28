/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author azizi
 */
import java.io.Serializable;

public class LibraryItem implements Serializable {
    private String name;
    private String desc;
    private String id;

    public LibraryItem(String name, String desc, String id) {
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getDesc() { return desc; }
    public String getId() { return id; }

    public void setName(String name) { this.name = name; }
    public void setDesc(String desc) { this.desc = desc; }
    public void setId(String id) { this.id = id; }
    
}

