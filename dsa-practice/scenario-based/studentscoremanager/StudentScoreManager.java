package studentscoremanager;

import java.util.Scanner;

public class StudentScoreManager {
	int[] scores;
	int noOfStudents;
	static int average;
	
	public StudentScoreManager(int noOfStudents) {
		this.scores= new int[noOfStudents];
		this.noOfStudents= noOfStudents;
	}
	
	public int avgScore() {
		int avg=0;
		for(int i=0;i<this.noOfStudents;i++) {
			avg+=this.scores[i];
		}
		average= avg/this.noOfStudents;
		return average;
	}
	
	public void highgestAndLowest() {
		int highest= Integer.MIN_VALUE;
		int lowest= Integer.MAX_VALUE;
		for(int i=0;i<this.noOfStudents;i++) {
			if(this.scores[i]>highest) {
				highest= this.scores[i];
			}
			if(this.scores[i]<lowest) {
				lowest= this.scores[i];
			}
		}
		System.out.println("The highest marks: "+ highest +" and lowest marks: "+lowest);
	}
	
	public void marksAboveAverage() {
		for(int i=0;i<this.noOfStudents;i++) {
			if(this.scores[i]>average) {
				System.out.println(this.scores[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int noOfStudents= 0;
		
		// Validate number of students
		while(true) {
			System.out.print("Enter number of students: ");
			try {
				noOfStudents= sc.nextInt();
				if(noOfStudents<=0) {
					System.out.println("Number of students must be greater than 0.");
					continue;
				}
				break;
			} catch(Exception e) {
				System.out.println("Invalid input. Please enter a numeric value.");
				sc.next(); // clear invalid input
			}
		}
		
		StudentScoreManager manager= new StudentScoreManager(noOfStudents);
		
		// Read and validate scores
		for(int i=0;i<noOfStudents;i++) {
			while(true) {
				System.out.print("Enter score for student "+(i+1)+": ");
				try {
					int score= sc.nextInt();
					if(score<0) {
						System.out.println("Score cannot be negative.");
						continue;
					}
					manager.scores[i]= score;
					break;
				} catch(Exception e) {
					System.out.println("Invalid input. Please enter a numeric value.");
					sc.next(); // clear invalid input
				}
			}
		}
		
		// Processing results
		System.out.println("Average score: "+ manager.avgScore());
		manager.highgestAndLowest();
		
		System.out.println("Scores above average:");
		manager.marksAboveAverage();
		
		sc.close();
	}

}
