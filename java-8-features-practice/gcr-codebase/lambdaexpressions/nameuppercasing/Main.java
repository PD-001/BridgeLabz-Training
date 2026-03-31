package lambdaexpressions.nameuppercasing;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<>();
		
		employees.add(new Employee(1, "Prakash"));
		employees.add(new Employee(2, "Anubhav"));
		employees.add(new Employee(3, "Sahil"));
		
		employees.stream().map(Employee::getname).map(String::toUpperCase).forEach(System.out::println);;
	}
}
