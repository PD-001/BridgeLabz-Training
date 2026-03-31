package generics.coursemanagementsystem;

public class ExamCourse extends CourseType {

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based";
    }

    @Override
    public double calculateFinalScore(double rawScore) {
        return rawScore * 0.9; // strict evaluation
    }
}
