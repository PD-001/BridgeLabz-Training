package annotationandreflection.annotation.annotationforloggingmethodexecutiontime;

import java.lang.reflect.Method;

public class Main {
	
	@LogExecutionTime
	public static void firstSpanOfTime() {
		for(int i=0;i<10000;i++) {
			
		}
	}
	
	@LogExecutionTime
	public static void secondSpanOfTime() {
		int i=0;
		while(i<10000) {
			i++;
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		Main mainobj = new Main();
		Class<?> cls= mainobj.getClass();
		
		Method[] mArray= cls.getDeclaredMethods();
		
		for(Method m:mArray) {
			if(m.isAnnotationPresent(LogExecutionTime.class)) {
				
				System.out.println(m.getName());
				
				long start= System.nanoTime();
				
				m.invoke(mainobj, null);
				
				long end= System.nanoTime();
				
				System.out.println("Execution time:"+ (end-start));
				System.out.println();
			}
		}
	}
}
