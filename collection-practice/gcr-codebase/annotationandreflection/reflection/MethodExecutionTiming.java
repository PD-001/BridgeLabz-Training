package annotationandreflection.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExecutionTiming {
	
	public static void forloop() {
		for(int i=0;i<10000;i++) {
			
		}
	}
	
	public static void whileloop() {
		int i=0;
		while(i<10000) {
			i++;
		}
	}
	
	public static void main(String[] args) {
//		MethodExecutionTiming obj= new MethodExecutionTiming();
		Class<?> cls= MethodExecutionTiming.class;
		Method[] methods= cls.getDeclaredMethods();
		
		for(Method m: methods) {
			
			if(!m.getName().equalsIgnoreCase("main")) {
				long start=System.nanoTime();
				try {
					m.invoke(null);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				long end= System.nanoTime();
				System.out.println(end-start);
			}
			
			
		}
	}
}
