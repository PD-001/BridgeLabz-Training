package universitysystem;

class Main {
    public static void main(String[] args) {

        University university= new University("Global Tech University");

        Faculty f1= new Faculty("Dr. Sharma");
        Faculty f2= new Faculty("Prof. Mehta");

        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        university.addFaculty(f1);
        university.addFaculty(f2);

        System.out.println();
        university.displayDepartments();

        System.out.println();
        university.displayFaculties();

        System.out.println();
        university.deleteUniversity();

        System.out.println();
        System.out.println("Faculty can exist independently:");
        System.out.println(f1.getFacultyName());
        System.out.println(f2.getFacultyName());
    }
}
