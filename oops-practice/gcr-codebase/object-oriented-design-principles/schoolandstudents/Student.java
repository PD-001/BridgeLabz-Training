package schoolandstudents;

import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name= name;
        this.courses= new ArrayList<>();
    }

    //method to enroll in a course (Association)
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name +" enrolled in "+ course.getCourseName());
    }

    //method to view enrolled courses
    public void viewCourses() {
        System.out.println("Courses enrolled by "+ name +":");
        for (Course c:courses) {
            System.out.println("- "+ c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
