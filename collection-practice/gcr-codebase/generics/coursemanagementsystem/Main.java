package generics.coursemanagementsystem;

public class Main {
	public static void main(String[] args) {

        Course<ExamCourse> algorithms =
            new Course<>("BCSE0101", "Algo", 4, new ExamCourse());

        Course<AssignmentCourse> softwareEng =
            new Course<>("BCSE0102", "OS", 3, new AssignmentCourse());

        Course<ResearchCourse> aiResearch =
            new Course<>("BCSE0103", "CN", 3, new ResearchCourse());

        Department csDept= new Department();

        csDept.addCourse(algorithms);
        csDept.addCourse(softwareEng);
        csDept.addCourse(aiResearch);

        csDept.listCourses();
    }
}
