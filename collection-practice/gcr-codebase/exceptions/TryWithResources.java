package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		String source= "info.txt";
		
		try (
				FileReader fr= new FileReader(source);
				BufferedReader br= new BufferedReader(fr);
			)
		{
			System.out.println(br.readLine());
		}
		catch(IOException e) {
			System.out.println("Error reading file");
		}

	}
}
