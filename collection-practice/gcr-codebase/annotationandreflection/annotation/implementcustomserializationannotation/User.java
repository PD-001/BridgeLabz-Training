package annotationandreflection.annotation.implementcustomserializationannotation;

public class User {
	
	@JsonField(name= "user_name")
	String username;
	
	@JsonField(name= "user_age")
	int age;
	
	User(String username, int age){
		this.username= username;
		this.age= age;
	}
	
}
