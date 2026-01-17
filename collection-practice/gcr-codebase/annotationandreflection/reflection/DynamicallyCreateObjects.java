package annotationandreflection.reflection;

import java.lang.reflect.Constructor;

class Student {
	String name;
	
	Student(String name){
		this.name= name;
	}
	
	public void display() {
		System.out.println(this.name);
	}
}

public class DynamicallyCreateObjects {
	public static void main(String[] args) throws Exception {
		Class<?> cls= Student.class;
		
		Constructor<?> constructor= cls.getDeclaredConstructor(String.class);
		
		Student student= (Student) constructor.newInstance("Prakash");
		
		student.display();
	}
}
