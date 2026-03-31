package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

public class DeleteDuplicates {
	public static void main(String[] args) {
		
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\studentdetails.csv";
		HashSet<String> hs= new HashSet<String>();
		
		try(
				BufferedReader br= new BufferedReader(new FileReader(source))
			){
			
			String line;
			
			while((line= br.readLine())!= null) {
				String[] coulumn= line.split(",");
				String id= coulumn[0];
				
				if(hs.contains(id)) {
					System.out.println("Duplicate record found:");
					System.out.println(line);
				}
				else {
					hs.add(id);
				}
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
