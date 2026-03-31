package employeemanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();

        FullTimeEmployee fte= new FullTimeEmployee(101, "Divanshu", 5000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte= new PartTimeEmployee(102, "Anubhav", 0, 80, 25);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        for (Employee e:employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}
