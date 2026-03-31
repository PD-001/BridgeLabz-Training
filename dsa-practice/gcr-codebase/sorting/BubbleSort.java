package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {2, 5, 7, 9, 1, 4};
		arr= bubbleSort(arr);//sort and store back in to array overwriting the unsorted one
		System.out.println(Arrays.toString(arr));//convert to array and print
	}
	public static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {//if current snaller than next
					//swap the numbers
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return arr;
	}
}
