package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class MergeTwoJSONObjects {
	public static void main(String[] args) {
		JSONObject obj1= new JSONObject();
		JSONObject obj2= new JSONObject();
		JSONArray arr= new JSONArray();
		
		obj1.put("name", "Prakash");
		obj1.put("age", 21);
		obj2.put("name", "Sahil");
		obj2.put("age", 20);
		
		arr.put(obj1);
		arr.put(obj2);
		
		System.out.println(arr.toString());
		
	}
}
