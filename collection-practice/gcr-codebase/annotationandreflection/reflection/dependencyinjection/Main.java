package annotationandreflection.reflection.dependencyinjection;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {

		Controller obj= new Controller();
		Field[] fields= obj.getClass().getDeclaredFields();

		for(Field field: fields) {

			if(field.isAnnotationPresent(Inject.class)) {

				try {
					Object dep= field.getType().getDeclaredConstructor().newInstance();
					field.setAccessible(true);
					field.set(obj, dep);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		obj.run();
	}
}
