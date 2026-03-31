package linearandbinarysearch;

import java.util.Scanner;

public class ConcatenateStringUsingStringBuffer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] strArray= new String[4];
		
		//take 4 strings as input
		for(int i=0;i<4;i++) strArray[i]=sc.nextLine();
		
		//initialize stringbuffer
		StringBuffer strBuffer= new StringBuffer();
		
		//add to string buffer
		for(int i=0;i<strArray.length;i++) strBuffer.append(strArray[i]);
		
		System.out.println(strBuffer.toString());
		sc.close();
	}
}
