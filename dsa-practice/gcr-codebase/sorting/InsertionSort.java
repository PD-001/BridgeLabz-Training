package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {2, 5, 7, 9, 1, 4};
		arr= insertionSort(arr);//sort and store back in to array overwriting the unsorted one
		System.out.println(Arrays.toString(arr));//convert to array and print
	}
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key= arr[i];//element to be placed at correct position
			int j= i-1;
			while(j>=0 && arr[j]>key) {//shift elements greater than key to right
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= key;//place key at correct position
		}
		return arr;
	}
}
