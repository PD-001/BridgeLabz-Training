package employeemanagementsystem;

public class Developer extends Employee{
	 private String programmingLanguage;

    public Developer(String name, int id, double salary, String language) {
        super.setName(name);
        super.setId(id);
        super.setSalary(salary);
        
        //add programming language if role is developer
        this.programmingLanguage= language;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: "+ programmingLanguage);
    }
}