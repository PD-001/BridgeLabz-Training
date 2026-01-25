package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountRowsFromCSV {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\writefromcode.csv";
		
		try(
				BufferedReader br= new BufferedReader(new FileReader(source));
			){
			String line;
			int c=0;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				c++;
			}
			System.out.println("Total no. of records:"+c);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
