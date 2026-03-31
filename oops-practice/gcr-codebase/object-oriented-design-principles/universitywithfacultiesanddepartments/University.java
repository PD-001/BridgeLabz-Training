package universitywithfacultiesanddepartments;

import java.util.ArrayList;

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName= universityName;
        this.departments= new ArrayList<>();
        this.faculties= new ArrayList<>();
    }

    //method to add department (Composition)
    public void addDepartment(String deptName) {
        Department department= new Department(deptName);
        departments.add(department);
        System.out.println(deptName +" department added to "+ universityName);
    }

    //method to add faculty (Aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println(faculty.getFacultyName() +" joined "+ universityName);
    }

    //method to display departments
    public void displayDepartments() {
        System.out.println("Departments in "+ universityName +":");
        for (Department d:departments) {
            System.out.println("- "+ d.getDepartmentName());
        }
    }

    //method to display faculty members
    public void displayFaculties() {
        System.out.println("Faculty members in "+ universityName + ":");
        for (Faculty f:faculties) {
            System.out.println("- "+ f.getFacultyName());
        }
    }

    //method to delete university (Composition effect)
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted. All departments removed.");
    }
}
