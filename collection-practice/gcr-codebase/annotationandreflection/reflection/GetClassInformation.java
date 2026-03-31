package annotationandreflection.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ClassA {
	
	int num;
	String variable;
	
	ClassA(int num, String variable){
		this.num= num;
		this.variable= variable;
	}
	
	public static void methodA() {
		System.out.println("this is method a");
	}
	
}

public class GetClassInformation {
	public static void main(String[] args) {
		ClassA obj= new ClassA(5, "value");
		Class<?> cls= obj.getClass();
		
//		System.out.println(cls.getName());
//		System.out.println(cls.getConstructors());
//		System.out.println(cls.getMethods());
//		System.out.println(cls.getFields());
		
		System.out.println("Constructors:");
		Constructor[] constructors= cls.getDeclaredConstructors();
		for(Constructor constructor: constructors) {
			System.out.println(constructor);
		}
		
		System.out.println("Methods:");
		Method[] methods= cls.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method);
		}
		
		System.out.println("Fields:");
		Field[] fields= cls.getDeclaredFields();
		for(Field field: fields) {
			System.out.println(field);
		}
	}
}
