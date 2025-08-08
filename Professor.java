package RegistrationSystem;
import java.util.ArrayList;

class Professor extends Person {
    private String professorId;
    private String department;
    private ArrayList<Course> teachingCourses;

    public Professor(String name, String email, String professorId, String department) {
        super(name, email);
        this.professorId = professorId;
        this.department = department;
        this.teachingCourses = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return "Professor: " + name + ", Email: " + email +
                ", ID: " + professorId + ", Department: " + department +
                ", Teaching Courses: " + teachingCourses.size();
    }

    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            System.out.println(course.courseTitle + " assigned to Professor " + name);
        }
    }
}
