package linearandbinarysearch;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class CountOccurrencesUsingFileReader {
	public static void main(String[] args) {
		//set file path
		String path="E:/DevTools/Projects/JAVA/BTraining/src/linearandbinarysearch/filewithmultipleoccurrences.txt";
		
//		FileReader fr= null;
//		BufferedReader br= null;
		int count= 0;
		String target= "hello";
		
		//use try and catch to ensure if file is not read the eroor is handled
		try (
				FileReader fr= new FileReader(path);
				BufferedReader br= new BufferedReader(fr);
			){
			
			String line;
			
			while((line= br.readLine())!=null) {
				String[] strArray= line.toLowerCase().split(" ");//split the line into individual words
				for(int i=0;i<strArray.length;i++) {
					if(strArray[i].equals(target)) count++;//check if any of the word is same as target
				}
			}
		}
		catch(IOException e) {
			System.out.println("Error caught during reading file: "+ e.getMessage());
		}
		
		System.out.println("The number of occurrences of target variable in the file are: "+ count);
	}
}
