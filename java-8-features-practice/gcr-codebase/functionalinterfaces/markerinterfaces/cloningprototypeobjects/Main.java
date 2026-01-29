package functionalinterfaces.markerinterfaces.cloningprototypeobjects;

public class Main {
	public static void main(String[] args) {
		try {
			Student student= new Student("Prakash", 21);
			Student copy= (Student) student.clone();
			
			student.display();
			copy.display();
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}
}
