package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\studentdetails.csv";
		
		try(
				BufferedReader br= new BufferedReader(new FileReader(source))
			){
			String line=br.readLine();
			while((line=br.readLine())!=null) {
				String[] coulumns= line.split(",");
				if(Integer.parseInt(coulumns[coulumns.length-1])>50) {
					System.out.println(line);
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
