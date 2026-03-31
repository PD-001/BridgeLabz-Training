package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr= {2, 5, 7, 9, 1, 4};
		arr= mergeSort(arr);//sort and store back in to array overwriting the unsorted one
		System.out.println(Arrays.toString(arr));//convert to array and print
	}
	public static int[] mergeSort(int[] arr) {
		if(arr.length<=1) {//base case
			return arr;
		}
		int mid= arr.length/2;
		int[] left= Arrays.copyOfRange(arr, 0, mid);//left half
		int[] right= Arrays.copyOfRange(arr, mid, arr.length);//right half

		left= mergeSort(left);//recursively sort left
		right= mergeSort(right);//recursively sort right

		return merge(left, right);//merge sorted halves
	}
	public static int[] merge(int[] left, int[] right) {
		int[] result= new int[left.length+right.length];
		int i=0,j=0,k=0;

		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				result[k++]= left[i++];
			}else {
				result[k++]= right[j++];
			}
		}
		while(i<left.length) {//copy remaining left elements
			result[k++]= left[i++];
		}
		while(j<right.length) {//copy remaining right elements
			result[k++]= right[j++];
		}
		return result;
	}
}
