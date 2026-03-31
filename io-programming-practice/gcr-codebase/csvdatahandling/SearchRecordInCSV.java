package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchRecordInCSV {
	public static void main(String[] args) {
		String source=  "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\writefromcode.csv";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of employee to be searched");
		String name= sc.nextLine();
		try(
				BufferedReader br= new BufferedReader(new FileReader(source));
			){
			String line;
			while((line=br.readLine())!= null) {
				String[] coulumns= line.split(",");
				if(coulumns[1].equalsIgnoreCase(name)) {
					System.out.println("Department:"+ coulumns[2] +"\nSalary:"+ coulumns[3]);
				}
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
