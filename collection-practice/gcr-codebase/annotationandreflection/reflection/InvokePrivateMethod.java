package annotationandreflection.reflection;

import java.lang.reflect.Method;

class Calculator {
	private int multiply(int a, int b) {
		return a*b;
	}
}

public class InvokePrivateMethod {
	public static void main(String[] args) throws Exception {
		Calculator c= new Calculator();
		Class<?> cls= c.getClass();
		
		Method method= cls.getDeclaredMethod("multiply", int.class, int.class);
		method.setAccessible(true);
		
		int result= (int) method.invoke(c, 5,5); 
		System.out.println(result);
	}
}
