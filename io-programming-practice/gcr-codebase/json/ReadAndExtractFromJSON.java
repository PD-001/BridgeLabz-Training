package json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadAndExtractFromJSON {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\student.json";
		
		StringBuilder sb= new StringBuilder();
		
		try(
				BufferedReader br= new BufferedReader(new FileReader(source))
			){
			String line;
			while((line=br.readLine())!=null) {
				sb.append(line);
			}
			JSONArray arr= new JSONArray(sb.toString());
			
			for(int i=0;i<arr.length();i++) {
				JSONObject obj= arr.getJSONObject(i);
				String name= obj.getString("name");
				System.out.println("Name:"+ name);
				String email= obj.getString("email");
				System.out.println("Email:"+ email);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
