package schoolandstudents;

import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName= courseName;
        this.students= new ArrayList<>();
    }

    //method to add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    //method to view enrolled students
    public void viewStudents() {
        System.out.println("Students enrolled in "+ courseName +":");
        for (Student s:students) {
            System.out.println("- "+ s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
