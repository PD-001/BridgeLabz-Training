package linearandbinarysearch;

import java.util.Arrays;

public class MissingPositiveAndBinarySearch {

	//method to find first missing positive number using linear search
	public static int findFirstMissingPositive(int[] arr) {

		int n= arr.length;
		boolean[] visited= new boolean[n+1];

		//mark visited positive numbers
		for (int i=0;i<n;i++) {
			if (arr[i]>0 && arr[i]<=n) {
				visited[arr[i]]= true;
			}
		}

		//find first missing positive
		for (int i=1;i<=n;i++) {
			if (visited[i]==false) {
				return i;
			}
		}

		return n+1;
	}

	//method to perform binary search
	public static int binarySearch(int[] arr,int target) {

		int left= 0;
		int right= arr.length-1;

		while (left<=right) {

			int mid= (left+right)/2;

			if (arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]<target) {
				left= mid+1;
			}
			else {
				right= mid-1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr= {3,4,-1,1};
		int target= 4;

		//linear search part
		int missingPositive= findFirstMissingPositive(arr);
		System.out.println("First missing positive number: "+missingPositive);

		//binary search part
		Arrays.sort(arr);
		int index= binarySearch(arr,target);

		System.out.println("Sorted Array: "+Arrays.toString(arr));
		System.out.println("Index of target "+target+": "+index);
	}
}
