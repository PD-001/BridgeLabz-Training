package csvdatahandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSV {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\writefromcode.csv";
		String destination= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\writefromcodeusingModify.csv";
		
		try (
				BufferedReader br= new BufferedReader(new FileReader(source));
				BufferedWriter bw= new BufferedWriter(new FileWriter(destination));
			){
			String line;
			while((line=br.readLine())!= null) {
				if(line.contains(",IT,")) {
					String[] coulumns= line.split(",");
					StringBuilder sb= new StringBuilder();
					for(int i=0;i<coulumns.length;i++) {
						if(i==3) {
							int salary=Integer.parseInt(coulumns[i]);
							salary=(salary*10/100)+salary;
							sb.append(salary);
						}
						else{							
							sb.append(coulumns[i]).append(",");
						}
					}
					bw.write(sb.toString());
					bw.newLine();
				}
				else{
					bw.write(line);
					bw.newLine();
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
