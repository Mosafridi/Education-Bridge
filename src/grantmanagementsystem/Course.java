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
public class Course {
    private int courseId;
    private String courseName;
    private int maxCapacity;
    private String courseLevel;

    // Constructor
    public Course(int courseId, String courseName, int maxCapacity, String courseLevel) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.courseLevel = courseLevel;
    }

    // Static array for specific functionalities
    public static Course[] course = new Course[6];

    // Static ArrayList for dynamic management
    private static ArrayList<Course> coursesList = new ArrayList<>();

    // Initialize both the array and the ArrayList
    public static void createCourse() {
        course[0] = new Course(1, "Mathematics", 30, "Beginner");
        course[1] = new Course(2, "Physics", 25, "Intermediate");
        course[2] = new Course(3, "Chemistry", 20, "Advanced");
        course[3] = new Course(4, "Biology", 15, "Intermediate");
        course[4] = new Course(5, "English", 40, "Beginner");

        // Populate ArrayList with the same data
        for (Course c : course) {
            if (c != null) {
                coursesList.add(c);
            }
        }
    }

    // Add a new course dynamically
    public static void addCourse(int courseId, String courseName, int maxCapacity, String courseLevel) {
        coursesList.add(new Course(courseId, courseName, maxCapacity, courseLevel));
    }

    // Remove a course dynamically by index
    public static boolean deleteCourse(int index) {
        if (index >= 0 && index < coursesList.size()) {
            coursesList.remove(index);
            return true;
        }
        return false; // Invalid index
    }

    // Get the ArrayList of courses
    public static ArrayList<Course> getCoursesList() {
        return coursesList;
    }

    // Getters and Setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    @Override
    public String toString() {
        return courseId + ", " + courseName + ", " + maxCapacity + ", " + courseLevel;
    }
}
