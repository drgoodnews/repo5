package RegistrationSystem;

import java.util.ArrayList;

class Student extends Person implements Registrable {
    private String studentId;
    private String major;
    private ArrayList<Course> registeredCourses;
    private final int MAX_COURSES = 5; // Limit for registration

    public Student(String name, String email, String studentId, String major) {
        super(name, email);
        this.studentId = studentId;
        this.major = major;
        this.registeredCourses = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return "Student: " + name + ", Email: " + email +
                ", ID: " + studentId + ", Major: " + major +
                ", Registered Courses: " + registeredCourses.size();
    }

    // Interface methods
    @Override
    public boolean registerCourse(Course course) {
        if (registeredCourses.size() >= MAX_COURSES) {
            System.out.println("Cannot register more than " + MAX_COURSES + " courses.");
            return false;
        }
        if (registeredCourses.contains(course)) {
            System.out.println("Already registered for course: " + course.courseTitle);
            return false;
        }
        registeredCourses.add(course);
        course.addStudent(this.name);
        return true;
    }

    @Override
    public boolean dropCourse(Course course) {
        if (registeredCourses.remove(course)) {
            course.removeStudent(this.name);
            return true;
        } else {
            System.out.println("You are not registered for this course.");
            return false;
        }
    }
}
