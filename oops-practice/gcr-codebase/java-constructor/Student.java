
public class Student {
    
    //attributes
    public int rollNumber;
    protected String name;
    private String CGPA;

    //getter for CGPA
    public String getCGPA() {
        return CGPA;
    }

    //setter for CGPA
    public void setCGPA(String CGPA) {
        this.CGPA = CGPA;
    }

    //parameterized constructor
    public Student(int rollNumber, String name, String CGPA) {
        this.rollNumber= rollNumber;
        this.name= name;
        setCGPA(CGPA);
    }

    public class PostgraduateStudent extends Student {
        
        String specialization;



        //constructor
        public PostgraduateStudent(int rollNumber, String name, String CGPA, String specialization) {
            super(rollNumber, name, CGPA);
            this.specialization= specialization;
        }

        //method to display postgraduate student details
        public void displayPostgraduateDetails() {
            System.out.println("Roll Number: "+ rollNumber);
            System.out.println("Name: "+ name);
            System.out.println("CGPA: "+ getCGPA());
            System.out.println("Specialization: "+ specialization);
        }
    }

    public static void main(String[] args) {
        //creating PostgraduateStudent object
        PostgraduateStudent pgStudent= new Student(101, "Alice", "3.8").new PostgraduateStudent(101, "Alice", "3.8", "Data Science");
        
        //displaying postgraduate student details
        pgStudent.displayPostgraduateDetails();
    }

}