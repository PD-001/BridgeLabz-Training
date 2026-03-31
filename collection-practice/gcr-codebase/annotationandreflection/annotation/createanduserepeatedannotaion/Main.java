package annotationandreflection.annotation.createanduserepeatedannotaion;

//import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Main {
	
	@BugReport(description= "first bug")
	@BugReport(description= "second bug")
	public static void method() {
		System.out.println("run when bug");
	}
	
	public static void main(String[] args) throws Exception{
		
		Class<?> cls= Main.class;
		
		Method m= cls.getDeclaredMethod("method", null);
		
		if(m.isAnnotationPresent(BugReports.class)) {
			BugReport[] br= m.getAnnotationsByType(BugReport.class);
			for(BugReport b:br) {
				System.out.println(b.description());
			}
		}
		
	}
}
