
class StudentNode {
	int rollNumber;
	String name;
	int age;
	char grade;
	StudentNode next;

	//constructor
	StudentNode(int rollNumber,String name,int age,char grade) {
		this.rollNumber= rollNumber;
		this.name= name;
		this.age= age;
		this.grade= grade;
		this.next= null;
	}
}

public class StudentLinkedList {

	private StudentNode head;

	//method to add student at beginning
	public void addAtBeginning(int rollNumber,String name,int age,char grade) {
		StudentNode newNode= new StudentNode(rollNumber,name,age,grade);
		newNode.next= head;
		head= newNode;
		System.out.println("Student added at beginning");
	}

	//method to add student at end
	public void addAtEnd(int rollNumber,String name,int age,char grade) {
		StudentNode newNode= new StudentNode(rollNumber,name,age,grade);

		if (head==null) {
			head= newNode;
			return;
		}

		StudentNode temp= head;
		while (temp.next!=null) {
			temp= temp.next;
		}
		temp.next= newNode;
		System.out.println("Student added at end");
	}

	//method to add student at specific position
	public void addAtPosition(int position,int rollNumber,String name,int age,char grade) {
		if (position==1) {
			addAtBeginning(rollNumber,name,age,grade);
			return;
		}

		StudentNode newNode= new StudentNode(rollNumber,name,age,grade);
		StudentNode temp= head;

		for (int i=1;i<position-1 && temp!=null;i++) {
			temp= temp.next;
		}

		if (temp==null) {
			System.out.println("Invalid position");
			return;
		}

		newNode.next= temp.next;
		temp.next= newNode;
		System.out.println("Student added at position "+position);
	}

	//method to delete student by roll number
	public void deleteByRollNumber(int rollNumber) {
		if (head==null) {
			System.out.println("List is empty");
			return;
		}

		if (head.rollNumber==rollNumber) {
			head= head.next;
			System.out.println("Student record deleted");
			return;
		}

		StudentNode temp= head;
		while (temp.next!=null && temp.next.rollNumber!=rollNumber) {
			temp= temp.next;
		}

		if (temp.next==null) {
			System.out.println("Student not found");
		}
		else {
			temp.next= temp.next.next;
			System.out.println("Student record deleted");
		}
	}

	//method to search student by roll number
	public void searchStudent(int rollNumber) {
		StudentNode temp= head;

		while (temp!=null) {
			if (temp.rollNumber==rollNumber) {
				System.out.println("Student Found:");
				displaySingleStudent(temp);
				return;
			}
			temp= temp.next;
		}
		System.out.println("Student not found");
	}

	//method to update grade
	public void updateGrade(int rollNumber,char newGrade) {
		StudentNode temp= head;

		while (temp!=null) {
			if (temp.rollNumber==rollNumber) {
				temp.grade= newGrade;
				System.out.println("Grade updated successfully");
				return;
			}
			temp= temp.next;
		}
		System.out.println("Student not found");
	}

	//method to display all students
	public void displayStudents() {
		if (head==null) {
			System.out.println("No student records available");
			return;
		}

		StudentNode temp= head;
		while (temp!=null) {
			displaySingleStudent(temp);
			temp= temp.next;
		}
	}

	//method to display single student
	private void displaySingleStudent(StudentNode student) {
		System.out.println("Roll Number: "+student.rollNumber);
		System.out.println("Name: "+student.name);
		System.out.println("Age: "+student.age);
		System.out.println("Grade: "+student.grade);
        System.out.println();
	}

	public static void main(String[] args) {

		StudentLinkedList list= new StudentLinkedList();

		list.addAtBeginning(101,"Amit",20,'A');
		list.addAtEnd(102,"Riya",21,'B');
		list.addAtPosition(2,103,"Karan",22,'C');

		System.out.println();
		list.displayStudents();

		System.out.println();
		list.searchStudent(102);

		System.out.println();
		list.updateGrade(103,'A');

		System.out.println();
		list.deleteByRollNumber(101);

		System.out.println();
		list.displayStudents();
	}
}
