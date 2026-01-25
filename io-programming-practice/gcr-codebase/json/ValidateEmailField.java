package json;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateEmailField {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\student.json";
		ObjectMapper mapper= new ObjectMapper();
		
		try {
			
			JsonNode root= mapper.readTree(new File(source));
			
			for(JsonNode node: root) {
				String email= node.get("email").asText();
				
				if(validateEmail(email)) {
					System.out.println("Email format correct.");
				}
				else {
					System.out.println("Email format wrong.");
				}
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static boolean validateEmail(String email) {
		
		Matcher matcher= Pattern.compile("[A-za-z0-9]+@[A-za-z]+\\.[a-z]{2,}").matcher(email);
		
		return matcher.matches();
	}
}
