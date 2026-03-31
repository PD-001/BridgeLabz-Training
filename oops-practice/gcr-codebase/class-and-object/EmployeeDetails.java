
public class EmployeeDetails {

	//non-static variables
	String name;
	int id;
	double salary;

	//constructor
	EmployeeDetails(String name, int id, double salary) {
		this.name= name;
		this.id= id;
		this.salary= salary;
	}

	//method to display employee details
	public void displayEmployee() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Salary: " + salary);
	}

	public static void main(String[] args) {
		EmployeeDetails emp= new EmployeeDetails("Rohan", 1, 500000);
		emp.displayEmployee();
	}
}
