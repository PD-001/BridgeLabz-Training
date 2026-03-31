public class Company {
   //static variable shared by all employees
   private static String companyName;
   private static int totalEmployees= 0;

   //instance variables
   private String name;
   private final int id; //final variable to ensure the employee ID cannot be modified
   private String designation;
   // constructor to initialize name, id, and designation
   public Company(String name, int id, String designation) {
       this.name= name;
       this.id= id;
       this.designation= designation;
       totalEmployees++;
   }
   //static method to set the company name
   public static void setCompanyName(String name) {
       companyName= name;
   }
   //static method to display the total number of employees
   public static void displayTotalEmployees() {
       System.out.println("Total Employees: "+ totalEmployees);
   }
   //method to display employee details
   public void displayEmployeeDetails() {
       //using 'instanceof' to verify the object's type before displaying details
       if (this instanceof Company) {
           System.out.println("Company Name: "+ companyName);
           System.out.println("Employee ID: "+ id);
           System.out.println("Name: "+ name);
           System.out.println("Designation: "+ designation);
       } else {
           System.out.println("The object is not an instance of the Employee class.");
       }
   }
   //getters for instance variables (optional, but recommended for encapsulation)
   public String getName() {
       return name;
   }
   public int getId() {
       return id;
   }
   public String getDesignation() {
       return designation;
   }
   public static void main(String[] args) {
       //set the company name (static variable)
       Company.setCompanyName("Tech Solutions Inc.");

       //create new employee instances
       Company emp1= new Company("Thamarai", 101, "Software Engineer");
       Company emp2= new Company("Rohan", 102, "Project Manager");

       //display total number of employees
       Company.displayTotalEmployees();
       
       //display employee details
       emp1.displayEmployeeDetails();
       emp2.displayEmployeeDetails();
   }
}
