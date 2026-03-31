package exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arrsize= sc.nextInt();
		int n= sc.nextInt();
		int[] arr= null;
		try {
			if(arrsize<1)System.out.println(arr.length);
			arr= new int[arrsize];
			for(int i=0;i<arrsize;i++) arr[i]= sc.nextInt();
			System.out.println("value at index "+ n +":"+ arr[n-1]);
		}
		catch(NullPointerException e) {
			System.out.println("Array is not initialized");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		sc.close();
	}
}
