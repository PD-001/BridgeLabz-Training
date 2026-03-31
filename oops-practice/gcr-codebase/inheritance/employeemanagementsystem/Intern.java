package employeemanagementsystem;

public class Intern extends Employee {
	private String college;

    public Intern(String name, int id, double salary, String college) {
    	 super.setName(name);
         super.setId(id);
         super.setSalary(salary);
         //initializing other values to employee(parent) class using super keyword
         this.college= college;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, College: "+ college);
    }
}