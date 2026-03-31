package generics.coursemanagementsystem;

import java.util.*;

public class Department {

    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void listCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course.getCourseDetails());
        }
    }
}
