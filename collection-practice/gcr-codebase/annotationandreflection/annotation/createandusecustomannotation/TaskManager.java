package annotationandreflection.annotation.createandusecustomannotation;

import java.lang.reflect.Method;

public class TaskManager {
	@TaskInfo(priority= 1, assignedTo= "Hello")
	public static void toppriority() {
		System.out.println("important");
	}
	
	public static void main(String[] args) throws Exception {
		Class<?> cls= TaskManager.class;
		Method method= cls.getDeclaredMethod("toppriority", null);
		if(method.isAnnotationPresent(TaskInfo.class)) {
			TaskInfo taskinfo= method.getDeclaredAnnotation(TaskInfo.class);
			System.out.println(method.getName());
			System.out.println(taskinfo.priority());
			System.out.println(taskinfo.assignedTo());
		}
	}
	
}
