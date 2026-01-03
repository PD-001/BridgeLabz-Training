package generics.coursemanagementsystem;

public abstract class CourseType {
	
	public abstract String getEvaluationMethod();

    public abstract double calculateFinalScore(double rawScore);
}
