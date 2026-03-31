package annotationandreflection.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperation {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
}

public class DynamicMethodInvocation {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		
		MathOperation obj= new MathOperation();
		Class<?> cls= obj.getClass();
		
		Method method1= cls.getDeclaredMethod("add", int.class, int.class);
		
		Method method2= cls.getDeclaredMethod("subtract", int.class, int.class);
		
		Method method3= cls.getDeclaredMethod("multiply", int.class, int.class);
		
		System.out.println("Choose operation:"); 
		System.out.println("1 for add");
		System.out.println("2 for subtract");
		System.out.println("3 for multiply");
		int value= sc.nextInt();
		int result=0;
		switch(value) {
		case 1:
			result= (int) method1.invoke(obj, 1,1);
			break;
		case 2:
			result= (int) method2.invoke(obj, 3,2);
			break;
		case 3:
			result= (int) method3.invoke(obj, 2,2);
			break;
		}
		System.out.println(result);
	}
}
