package linearandbinarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ReadFileUsingFileReader {
	public static void main(String[] args) {
		//set file path
		String path = "E:/DevTools/Projects/JAVA/BTraining/src/linearandbinarysearch/fileforproblem.txt";
		
//		FileReader fr= null;
//		BufferedReader br= null;
		
		//use try and catch to ensure if file is not read the eroor is handled
		try (
				FileReader fr= new FileReader(path);
				BufferedReader br= new BufferedReader(fr);
			)
		{
			
			
			String line;
			
			while((line= br.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			System.out.println("Error reading the file: "+ e.getMessage());
		}
		
	}
}
