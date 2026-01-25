package csvdatahandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToCSV {
	public static void main(String[] args) {
		String source="writefromcode.csv";
		Scanner sc= new Scanner(System.in);
		try(
				BufferedWriter bw= new BufferedWriter(new FileWriter(source))
			){
				int c=1;
				String s="y";
				while(c<=5 || s.equalsIgnoreCase("y")) {
					System.out.println("Enter atleast 5 person's details.");
					StringBuilder sb= new StringBuilder();
					System.out.println("Enter details:");
					System.out.println("Id:");
					sb.append(sc.nextLine()).append(",");
					System.out.println("Name:");
					sb.append(sc.nextLine()).append(",");
					System.out.println("Department:");
					sb.append(sc.nextLine()).append(",");
					System.out.println("Salary:");
					sb.append(sc.nextLine());
					String line=sb.toString();
					bw.write(line);
					bw.newLine();
					c++;
					if(c>5) {
						System.out.println("enetr more person details?(y/n)");
						s=sc.nextLine();
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
