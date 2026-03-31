package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class SortByMemory {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\writefromcode.csv";
		try (
				BufferedReader br = new BufferedReader(new FileReader(source))
			) {
	         String line;
	         PriorityQueue<String[]> pq= new PriorityQueue<String[]>((a,b)->Integer.parseInt(b[3])-Integer.parseInt(a[3]));
	         while ((line= br.readLine())!=null) {
	        	 String[] coulumns= line.split(",");
	        	 pq.offer(coulumns);
	         }
	         for(int i=0;i<5;i++) {
	        	 String[] strarray= pq.poll();
	        	 System.out.println("Id:"+ strarray[0] +" Name:"+ strarray[1] +" Department:"+ strarray[2] +" Salary:"+ strarray[3]);
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
