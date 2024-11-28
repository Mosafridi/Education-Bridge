/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author azizi
 */
public class DVD extends LibraryItem {
    private int duration;

    public DVD(String name, String desc, String id, int duration) {
        super(name, desc, id);
        this.duration = duration;
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
}

