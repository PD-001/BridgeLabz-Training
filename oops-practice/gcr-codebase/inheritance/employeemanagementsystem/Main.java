package employeemanagementsystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//create a Scanner Object
		Scanner sc= new Scanner(System.in);

		//take input for the number of employees
		System.out.print("How many employees do you want to add? ");
		int count= Integer.parseInt(sc.nextLine());

		//create an array to hold Employee objects
		Employee[] employees= new Employee[count];

		//loop to take input for each employee
		for (int i=0;i<count;i++) {
			//take input for each employee's details
			System.out.println("\nEnter details for employee #"+ (i+1));
			System.out.print("Enter role (Manager / Developer / Intern): ");
			String role= sc.nextLine().trim();

			System.out.print("Enter name: ");
			String name= sc.nextLine();

			System.out.print("Enter ID: ");
			int id= Integer.parseInt(sc.nextLine());

			System.out.print("Enter salary: ");
			double salary= Double.parseDouble(sc.nextLine());

			switch (role.toLowerCase()) {
				case "manager":
					System.out.print("Enter team size: ");
					int teamSize= Integer.parseInt(sc.nextLine());
					employees[i]= new Manager(name, id, salary, teamSize);
					break;

				case "developer":
					System.out.print("Enter programming language: ");
					String language= sc.nextLine();
					employees[i]= new Developer(name, id, salary, language);
					break;

				case "intern":
					System.out.print("Enter university name: ");
					String university= sc.nextLine();
					employees[i]= new Intern(name, id, salary, university);
					break;

				default:
					System.out.println("Invalid role! Skipping this employee.");
					i--; // Let the user try again
			}
		}

		// Display all employee details
		System.out.println("\n--- Employee Details ---");
		for (Employee e:employees) {
			if (e!=null) {
				e.displayDetails();
				System.out.println("---------------");
			}
		}

		// Close the scanner
		sc.close();
	}
}