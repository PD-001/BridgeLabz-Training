package employeemanagementsystem;

public class Manager extends Employee{
	private int teamSize;
	// manager has team size 
    public Manager(String name, int id, double salary, int teamSize) {
    	super.setName(name);
        super.setId(id);
        super.setSalary(salary);
        this.teamSize= teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: "+ teamSize);
    }
}