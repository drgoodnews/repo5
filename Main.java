package RegistrationSystem;


public class Main {
    public static void main (String[] args){
        Course c1 = new Course("CS101", "Intro to Programming", 3);
        Course c2 = new Course("MATH201", "Calculus", 4);

        // Create student
        Student s1 = new Student("Alaa", "alaa@email.com", "S001", "Computer Science");

        // Create professor
        Professor p1 = new Professor("Dr. Omar", "omar@univ.com", "P101", "Mathematics");

        // Assign course to professor
        p1.assignCourse(c2);

        // Student registers for courses
        s1.registerCourse(c1);
        s1.registerCourse(c2);

        // Show details
        System.out.println(s1.getDetails());
        System.out.println(p1.getDetails());

        // Student drops a course
        s1.dropCourse(c2);

        // Show details after drop
        System.out.println(s1.getDetails());
    }
}
