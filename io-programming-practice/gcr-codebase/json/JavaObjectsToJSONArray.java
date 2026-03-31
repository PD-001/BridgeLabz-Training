package json;

import java.util.List;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

class Student {
	int id;
	String name;
	String email;
	
	public Student(int id, String name, String email) {
		this.id= id;
		this.name= name;
		this.email= email;
	}
}

public class JavaObjectsToJSONArray {
	public static void main(String[] args) {
		Student s1= new Student(1,"Anubhav","anubhav@gmail.com");
		Student s2= new Student(2,"Prakash","prakash@gmail.com");
		Student s3= new Student(3,"Sahil","sahil@gmail.com");
		
		List<Student> students= new ArrayList<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		JSONArray jsonArray= new JSONArray();
		
		for(Student s: students) {
			JSONObject jsonobject= new JSONObject();
			jsonobject.put("id", s.id);
			jsonobject.put("name", s.name);
			jsonobject.put("email", s.email);
//			
			jsonArray.put(jsonobject);
		}
		
		System.out.println(jsonArray.toString());
		
	}
}
