package generics.coursemanagementsystem;

public class AssignmentCourse extends CourseType {

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based";
    }

    @Override
    public double calculateFinalScore(double rawScore) {
        return rawScore; // lenient
    }
}
s