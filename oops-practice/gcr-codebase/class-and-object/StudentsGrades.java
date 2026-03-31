
public class StudentsGrades {

	//declaring variables to store student details
	String name;
	String rollNumber;
	double[] marks;

	//constructor
	StudentsGrades(String name, String rollNumber, double[] marks) {
		this.name= name;
		this.rollNumber= rollNumber;
		this.marks= marks;
	}

	//method to calculate grade
	public String calculateGrade(double[] marks) {

		//variable to store the average marks
		double totalMarks= calculateTotalMarks(marks);

		if (totalMarks>=80 && totalMarks<=100) {
			return "Grade A";
		}
		else if (totalMarks>=60 && totalMarks<80) {
			return "Grade B";
		}
		else if (totalMarks>=50 && totalMarks<60) {
			return "Grade C";
		}
		else if (totalMarks>=40 && totalMarks<50) {
			return "Grade D";
		}
		else {
			return "Grade F";
		}
	}

	//method to display student details
	public void displayStudent() {
		System.out.println("Student Name: "+ name);
		System.out.println("Student Roll Number: "+ rollNumber);
		System.out.println("Student Marks:");

		for (int i=0;i<marks.length;i++) {
			System.out.println("Mark "+ (i+1) +": "+ marks[i]);
		}

		System.out.println("Student Grade: "+ calculateGrade(marks));
	}

	//method to calculate average marks
	public double calculateTotalMarks(double[] marks) {
		double sum= 0;

		for (int i=0; i<marks.length; i++) {
			sum+=marks[i];
		}

		return sum/marks.length;
	}

	public static void main(String[] args) {

		//arrays to store marks
		double[] mark1= {80, 70, 75};
		double[] mark2= {60, 65, 50};

		//creating student objects
		StudentsGrades student1= new StudentsGrades("Pushpak", "001", mark1);
		StudentsGrades student2= new StudentsGrades("Kanishk", "002", mark2);

		//displaying student details
		student1.displayStudent();
		student2.displayStudent();
	}
}
