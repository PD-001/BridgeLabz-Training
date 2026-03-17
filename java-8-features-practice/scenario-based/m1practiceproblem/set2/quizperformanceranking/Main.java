package m1practiceproblem.set2.quizperformanceranking;

import java.util.*;

class Student {
	
	String name;
	String dept;
	int q1;
	int q2;
	int q3;
	
	public Student(String name, String dept, int q1, int q2, int q3) {
		this.name= name;
		this.dept= dept;
		this.q1= q1;
		this.q2= q2;
		this.q3= q3;
	}
	
	public int total() {
		return q1+q2+q3;
	}
}

public class Main {
	
	static ArrayList<Student> list= new ArrayList<>();
	
	public static void record(String name, String dept, int q1, int q2, int q3) {
		
		Student s= new Student(name, dept, q1, q2, q3);
		list.add(s);
		
		System.out.println("Record Added: "+name);
	}
	
	public static void topDept(String dept) {
		
		if(list.size()==0) {
			System.out.println("No Records Available");
			return;
		}
		
		ArrayList<Student> temp= new ArrayList<>();
		
		for(Student s: list) {
			if(s.dept.equalsIgnoreCase(dept)) {
				temp.add(s);
			}
		}
		
		if(temp.size()==0) {
			System.out.println("Department Not Found");
			return;
		}
		
		int max= Integer.MIN_VALUE;
		
		for(Student s: temp) {
			max= Math.max(max, s.total());
		}
		
		for(Student s: temp) {
			if(s.total()==max) {
				System.out.println(s.name+" "+s.total());
			}
		}
		
	}
	
	public static void topQuiz(String quiz) {
		
		if(list.size()==0) {
			System.out.println("No Records Available");
			return;
		}
		
		int max= Integer.MIN_VALUE;
		
		if(quiz.equalsIgnoreCase("Q1")) {
			
			for(Student s: list) {
				max= Math.max(max, s.q1);
			}
			
			for(Student s: list) {
				if(s.q1==max) {
					System.out.println(s.name+" "+s.q1);
				}
			}
		}
		
		else if(quiz.equalsIgnoreCase("Q2")) {
			
			for(Student s: list) {
				max= Math.max(max, s.q2);
			}
			
			for(Student s: list) {
				if(s.q2==max) {
					System.out.println(s.name+" "+s.q2);
				}
			}
		}
		
		else {
			
			for(Student s: list) {
				max= Math.max(max, s.q3);
			}
			
			for(Student s: list) {
				if(s.q3==max) {
					System.out.println(s.name+" "+s.q3);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			
			String[] strArray= sc.nextLine().split("\\s");
			
			if(strArray[0].equalsIgnoreCase("Record")) {
				
				record(strArray[1], strArray[2],
						Integer.parseInt(strArray[3]),
						Integer.parseInt(strArray[4]),
						Integer.parseInt(strArray[5]));
			}
			
			else {
				
				if(strArray[1].equalsIgnoreCase("Q1") ||
				   strArray[1].equalsIgnoreCase("Q2") ||
				   strArray[1].equalsIgnoreCase("Q3")) {
					
					topQuiz(strArray[1]);
				}
				else {
					topDept(strArray[1]);
				}
			}
		}
	}
}