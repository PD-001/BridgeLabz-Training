package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedFileNotFound {
	public static void main(String[] args) {
		String source= "data.txt";
		try (
				//file reader initialisation
				FileReader fr= new FileReader(source);
			)
		{
			
			//read char by char
			int ch;
			while((ch= fr.read())!=-1) {
				char c=(char) ch;
				System.out.println(Character.toLowerCase(c));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error:"+ e.getMessage());
		}
	}
}
