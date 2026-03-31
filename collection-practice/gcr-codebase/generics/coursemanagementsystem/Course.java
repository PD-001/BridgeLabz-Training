package generics.coursemanagementsystem;

public class Course<T extends CourseType> {

    private String courseCode;
    private String courseName;
    private int credits;
    private T courseType;

    public Course(String courseCode, String courseName, int credits, T courseType) {
        this.courseCode= courseCode;
        this.courseName= courseName;
        this.credits= credits;
        this.courseType= courseType;
    }

    public String getCourseDetails() {
        return courseCode +" - "+ courseName +" ("+ courseType.getEvaluationMethod() +")";
    }

    public double evaluate(double rawScore) {
        return courseType.calculateFinalScore(rawScore);
    }

    public T getCourseType() {
        return courseType;
    }
}
