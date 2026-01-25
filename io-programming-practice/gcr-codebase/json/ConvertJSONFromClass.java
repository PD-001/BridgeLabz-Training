package json;

import org.json.JSONObject;

public class ConvertJSONFromClass {
	public static void main(String[] args) {
		JSONObject student= new JSONObject();
		
		student.put("Name", "Prakash");
		student.put("Age", 21);
		student.put("Subjects", new String[] {"Data Structures", "Algorithms"});
		
		System.out.println(student.toString());
	}
}
