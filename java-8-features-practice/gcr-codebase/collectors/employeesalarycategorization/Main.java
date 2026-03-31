package collectors.employeesalarycategorization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String department;
	double salary;

	public Employee(String department, double salary) {
		this.department= department;
		this.salary= salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department= department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary= salary;
	}
}

public class Main {
	public static void main(String[] args) {

		List<Employee> employees= new ArrayList<>(
				Arrays.asList(
						new Employee("IT", 60000),
						new Employee("IT", 80000),
						new Employee("HR", 40000)
				)
		);

		Map<String, Double> avgSalaryByDept=
				employees.stream()
					.collect(Collectors.groupingBy(
							Employee::getDepartment,
							Collectors.averagingDouble(Employee::getSalary)
					));

		System.out.println(avgSalaryByDept);
	}
}
