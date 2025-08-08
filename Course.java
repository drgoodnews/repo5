package RegistrationSystem;

import java.util.ArrayList;

public class Course {
    public String courseCode;
    public String courseTitle;
    private int creditHours;
    private ArrayList<String> enrolledStudents;

    public Course(String courseCode, String courseTitle, int creditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        setCreditHours(creditHours);
        this.enrolledStudents = new ArrayList<>();
    }

    public int getCreditHours() {
        return creditHours;
    }

    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCreditHours(int creditHours) {
        if(creditHours >= 1 || creditHours <= 5)
            this.creditHours = creditHours;
        else
            System.out.println("Crdit Hours must be between 1 to 5 hours");
    }

    public void setEnrolledStudents(ArrayList<String> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void addStudent(String studentName) {
        if (!enrolledStudents.contains(studentName)) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " has been added to " + courseTitle + ".");
        } else {
            System.out.println(studentName + " is already enrolled in " + courseTitle + ".");
        }
    }

    public void removeStudent(String studentName) {
        if (enrolledStudents.contains(studentName)) {
            enrolledStudents.remove(studentName);
            System.out.println(studentName + " has been removed from " + courseTitle + ".");
        } else {
            System.out.println(studentName + " is not enrolled in " + courseTitle + ".");
        }
    }
}
