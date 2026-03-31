package linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputUsingInputStreamReader {
	public static void main(String[] args) {
		//sett file path
		String path = "E:/DevTools/Projects/JAVA/BTraining/src/linearandbinarysearch/userInput.txt";
		
		
		//use try and catch to ensure if file is not read the eroor is handled
		try(
				InputStreamReader isr= new InputStreamReader(System.in);
				BufferedReader br= new BufferedReader(isr);
				FileWriter fw= new FileWriter(path,true);
			){
			
			String input;
			System.out.println("Enter text(enter 'exit' to stop):");
			
			while(true) {
				input= br.readLine();
				if(input.equalsIgnoreCase("exit")) {//if user inputs exit break the loop of taking input
					break;
				}
				fw.write(input + System.lineSeparator());
			}
			
			System.out.println("Written in file.");
			
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
