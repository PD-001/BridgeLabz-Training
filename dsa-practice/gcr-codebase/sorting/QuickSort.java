package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr= {2, 5, 7, 9, 1, 4};
		quickSort(arr, 0, arr.length-1);//sort array in-place
		System.out.println(Arrays.toString(arr));//convert to array and print
	}
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {//base condition
			int pivotIndex= partition(arr, low, high);//place pivot at correct position
			quickSort(arr, low, pivotIndex-1);//sort left part
			quickSort(arr, pivotIndex+1, high);//sort right part
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot= arr[high];//choose last element as pivot
		int i= low-1;

		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {//place smaller elements on left
				i++;
				int temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		int temp= arr[i+1];//place pivot at correct position
		arr[i+1]= arr[high];
		arr[high]= temp;

		return i+1;
	}
}
