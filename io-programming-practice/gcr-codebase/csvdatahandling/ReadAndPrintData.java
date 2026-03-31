package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndPrintData {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\studentdetails.csv";
		
		try (
				BufferedReader br= new BufferedReader(new FileReader(source));
			){
			String line=br.readLine();
			while((line=br.readLine())!=null) {
				String[] strarray= line.split(",");
				System.out.println("Id: "+ strarray[0] +"\nName:"+ strarray[1] +"\nAge:"+ strarray[2] +"\nMarks:"+ strarray[3]);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
