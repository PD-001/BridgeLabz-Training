
public class Course {

    //instance variables
    String courseName;
    double fee;
    int duration;//duration in weeks

    //class variable
    static String instituteName= "Global Code Academy";

    //default constructor
    Course() {
        courseName= "Not Assigned";
        fee= 0.0;
        duration= 0;
    }

    //parameterized constructor
    Course(String courseName, double fee, int durationInWeeks) {
        this.courseName= courseName;
        this.fee= fee;
        this.duration= durationInWeeks;
    }

    //creating method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: "+ courseName);
        System.out.println("Fee: "+ fee);
        System.out.println("Duration (weeks): "+ duration);
    }

    public static void updateInstituteName(String newName) {
        instituteName= newName;
    }

    public static void main(String[] args) {

        //using default constructor
        Course course1= new Course();
        course1.displayCourseDetails();

        System.out.println();

        //using parameterized constructor
        Course course2= new Course("Java Programming", 5000.0, 8);
        course2.displayCourseDetails();

        //uspdate institute name
        Course.updateInstituteName("Tech Learning Hub");
    }
}