package annotationandreflection.annotation.implementcustomserializationannotation;

import java.lang.reflect.Field;

public class Main {
	
	public static String toJson(Object obj) {
		if(obj==null)
			return "{}";
		
		StringBuilder json= new StringBuilder("{");
		
		Class<?> cls= obj.getClass();
		Field[] fields= cls.getDeclaredFields();
		
		boolean firstField=true;
		
		for(Field field: fields) {
			if(field.isAnnotationPresent(JsonField.class)) {
				
				field.setAccessible(true);
				JsonField annotation= field.getAnnotation(JsonField.class);
				String key= annotation.name();
				
				try {
					Object value= field.get(obj);
					
					if(!firstField)
						json.append(", ");
					
					json.append("\"").append(key).append("\": ");
					
					if(value instanceof String)
						json.append("\"").append(value).append("\"");
					else
						json.append(value);
					
					firstField=false;
					
				} catch(IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		json.append("}");
		return json.toString();
	}
	
	public static void main(String[] args) {
		User user= new User("Prakash", 22);
		System.out.println(toJson(user));
	}
	
}
