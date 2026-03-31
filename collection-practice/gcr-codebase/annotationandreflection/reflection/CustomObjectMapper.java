package annotationandreflection.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapper {
	
	String name="default";
	int age=0;
	
	public static Object toObject(Class<?> cls, Map<String, Object> properties) {
		Object obj=null;
		try {
			Constructor<?> constructor= cls.getDeclaredConstructor();
			obj= constructor.newInstance();
			Field[] fields= cls.getDeclaredFields();
			for(Field field: fields) {
				field.setAccessible(true);
				field.set(obj, properties.get(field.getName()));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
		
	}
	
	public static void main(String[] args) {
		Map<String,Object> hm= new HashMap<>();
		hm.put("name", "Prakash");
		hm.put("age", 21);
		
		Class<?> cls= CustomObjectMapper.class;
		CustomObjectMapper obj= (CustomObjectMapper) toObject(cls, hm);
		System.out.println(obj.name +":"+ obj.age);
	}
}
