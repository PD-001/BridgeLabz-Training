package annotationandreflection.annotation.createmaxlengthannotaion;

import java.lang.reflect.Field;

class User {
	@MaxLength(value=16)
	String username;
	
	User(String username){
		
		Class<?> cls= User.class;
		
		try {
			Field field= cls.getDeclaredField("username");
			if(field.isAnnotationPresent(MaxLength.class)) {
				if(field.getAnnotation(MaxLength.class).value()<username.length()) {
					throw new IllegalArgumentException("length limit exceeded");
				}
				else {
					this.username= username;
				}
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		User user= new User("Prakash");
		System.out.println("obj created");
	}
}
