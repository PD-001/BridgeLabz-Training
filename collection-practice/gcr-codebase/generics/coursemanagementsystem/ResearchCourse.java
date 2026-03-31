package generics.coursemanagementsystem;

public class ResearchCourse extends CourseType {

    @Override
    public String getEvaluationMethod() {
        return "Research-Based";
    }

    @Override
    public double calculateFinalScore(double rawScore) {
        return rawScore * 1.1; // bonus for innovation
    }
}
