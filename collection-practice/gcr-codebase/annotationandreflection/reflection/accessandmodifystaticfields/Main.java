package annotationandreflection.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) {
		Class<?> cls= Configuration.class;
		
		try {
			Field field= cls.getDeclaredField("API_KEY");
			field.setAccessible(true);
			System.out.println(field.get(null));
			field.set(cls, "com.prakash");
			System.out.println(field.get(null));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
