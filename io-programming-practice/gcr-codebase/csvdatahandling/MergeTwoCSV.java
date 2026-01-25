package csvdatahandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MergeTwoCSV {
	public static void main(String[] args) {
		String source1= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\student1.csv";
		String source2= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\student2.csv";
		String destination= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\studentmerged.csv";
		LinkedHashMap<String,ArrayList<String>> hm= new LinkedHashMap<>();
		
		try(
				BufferedReader br1= new BufferedReader(new FileReader(source1));
				BufferedReader br2= new BufferedReader(new FileReader(source2));
				BufferedWriter bw= new BufferedWriter(new FileWriter(destination))
			){
			
			String line;
			while((line=br1.readLine())!= null) {
				String[] coulumn= line.split(",");
				ArrayList<String> coulumnExceptId= new ArrayList<String>();
				for(int i=1;i<coulumn.length;i++) {
					coulumnExceptId.add(coulumn[i]);
				}
				hm.put(coulumn[0], coulumnExceptId);
			}
			
			while((line=br2.readLine())!= null) {
				String[] coulumn= line.split(",");
				
				ArrayList<String> arr= hm.get(coulumn[0]); 
				
				arr.add(coulumn[1]);
				arr.add(coulumn[2]);
			}
			
			for(String id:hm.keySet()) {
			    bw.write(id);
			    for(String value:hm.get(id)) {
			        bw.write(","+ value);
			    }
			    bw.newLine();
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
