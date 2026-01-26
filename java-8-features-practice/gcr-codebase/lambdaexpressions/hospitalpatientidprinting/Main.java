package lambdaexpressions.hospitalpatientidprinting;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Patient> patients= new ArrayList<>();
		
		patients.add(new Patient(1,"Prakash"));
		patients.add(new Patient(2,"Anubhav"));
		patients.add(new Patient(3,"Sahil"));
		
		patients.stream().map(Patient::getid).forEach(System.out::println);
	}
}
