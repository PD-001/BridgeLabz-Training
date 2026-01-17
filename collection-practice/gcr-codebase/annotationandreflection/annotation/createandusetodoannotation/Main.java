package annotationandreflection.annotation.createandusetodoannotation;

import java.lang.reflect.Method;

public class Main {
	
	@Todo(task= "add two numbers",assignedTo= "member 1", priority= "High")
	public static void add() {
		System.out.println("adds two numbers");
	}

	@Todo(task= "multiply two numbers",assignedTo= "member 2", priority= "Low")
	public static void multiply() {
		System.out.println("multiply two numbers");
	}
	
	@Todo(task= "subtract two numbers",assignedTo= "member 3")
	public static void subtract() {
		System.out.println("subtract one number from other");
	}
	
	public static void main(String[] args) {
		
		Class<?> cls= Main.class;
		Method[] mArray= cls.getDeclaredMethods();
		
		for(Method m:mArray) {
			if(m.isAnnotationPresent(Todo.class)) {
				System.out.println(m.getName()+":\n"+
							m.getAnnotation(Todo.class).task()+"\n"+
							m.getAnnotation(Todo.class).assignedTo()+"\n"+
							m.getAnnotation(Todo.class).priority()
						);
			}
		}
		
	}
}
