package linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToCharUsingInputStreamReader {
	public static void main(String[] args) {
		//give path
		String path = "E:/DevTools/Projects/JAVA/BTraining/src/linearandbinarysearch/fileforinputstreamreaderquestion.txt";
		
		//use try and catch to ensure if file is not read the eroor is handled
		try(
				FileInputStream fis= new FileInputStream(path);
				InputStreamReader isr= new InputStreamReader(fis,StandardCharsets.UTF_8);
				BufferedReader br= new BufferedReader(isr);
				
			){
			
			String line;
			
			while((line=br.readLine())!=null) {
				System.out.println(line);//print line
			}
			
		}
		catch(IOException e) {
			System.out.println("Error caught while reading file: "+ e.getMessage());
		}
	}
}
