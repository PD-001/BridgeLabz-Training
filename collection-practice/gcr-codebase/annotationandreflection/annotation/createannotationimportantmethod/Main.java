package annotationandreflection.annotation.createannotationimportantmethod;

import java.lang.reflect.Method;

public class Main {
	
	@ImportantMethod
	public static void method1() {
		System.out.println("most important");
	}
	
	@ImportantMethod(level= "Low")
	public static void method2() {
		System.out.println("not that important");
	}
	
	public static void main(String[] args) throws Exception{
		
		Class<?> cls= Main.class;
		
		Method[] meths= cls.getDeclaredMethods();
		
		for(Method m: meths) {
			if(m.isAnnotationPresent(ImportantMethod.class)) {
				System.out.println(m.getName()+":"+m.getAnnotation(ImportantMethod.class).level());
			}
		}
		
	}
}
