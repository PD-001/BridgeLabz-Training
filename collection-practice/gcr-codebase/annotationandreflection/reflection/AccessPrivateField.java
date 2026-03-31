package annotationandreflection.reflection;

import java.lang.reflect.Field;

class Person {
	private int age=9;
}

public class AccessPrivateField {
	public static void main(String[] args) throws Exception {
		Person obj= new Person();
		Class<?> cls= obj.getClass();
		
		Field field= cls.getDeclaredField("age");
		field.setAccessible(true);
		
		System.out.println(field.get(obj));
		
		field.set(obj, 18);
		
		System.out.println(field.get(obj));
	}
}
