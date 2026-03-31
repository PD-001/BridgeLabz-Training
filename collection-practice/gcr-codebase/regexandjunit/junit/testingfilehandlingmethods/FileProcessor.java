package regexandjunit.junit.testingfilehandlingmethods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
	
	public void writeToFile(String filename, String content) throws IOException {
		try (
				FileWriter fw= new FileWriter(filename);
			)
		{
			fw.write(content);
		}
	}
	
	public String readFromFile(String filename) throws FileNotFoundException, IOException {
		StringBuilder strBuilder= new StringBuilder();
		try (
				FileReader fr= new FileReader(filename);
				BufferedReader br= new BufferedReader(fr);
			)
		{
			String line;
			while((line=br.readLine())!=null) {
				strBuilder.append(line).append("\n");
			}
		}
		return strBuilder.toString();
	}
	
}
