package schoolandstudents;

import java.util.ArrayList;

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName= schoolName;
        this.students= new ArrayList<>();
    }

    //method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() +" added to "+ schoolName);
    }

    //method to display all students in the school
    public void displayStudents() {
        System.out.println("Students in "+ schoolName +":");
        for (Student s:students) {
            System.out.println("- "+ s.getName());
        }
    }
}
