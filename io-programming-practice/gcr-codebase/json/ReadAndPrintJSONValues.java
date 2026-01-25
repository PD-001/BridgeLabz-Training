package json;

import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadAndPrintJSONValues {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\studentwithage.json";
		
		try {
			String jsoncontent= Files.readString(Path.of(source));
			
			JSONArray array= new JSONArray(jsoncontent);
			
			for(int i=0;i<array.length();i++) {
				JSONObject obj= array.getJSONObject(i);
				System.out.println(obj);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
