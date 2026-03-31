package json;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class CSVToJSON {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\student.csv";
		
		try {
			
			List<String> lines= Files.readAllLines(Path.of(source));
			
			String[] headers= lines.get(0).split(",");
			
			JSONArray array= new JSONArray();
			
			for(int i=1;i<lines.size();i++) {
				String[] values= lines.get(i).split(",");
				
				JSONObject obj= new JSONObject();
				for(int j=0;j<headers.length;j++) {
					obj.put(headers[j], values[j]);
				}
				array.put(obj);
			}
			System.out.println(array.toString());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
