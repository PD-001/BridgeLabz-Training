package linearandbinarysearch;

public class FindFirstNegativeNumber {

	//method to find index of first negative number
	public static int findFirstNegative(int[] arr) {

		for (int i=0;i<arr.length;i++) {
			if (arr[i]<0) {//iterate over array and check if any are same if they are return them
				return i;
			}
		}
		return -1;// else return -1
	}

	public static void main(String[] args) {

		int[] arr= {5,10,3,-7,9,-2};

		int index= findFirstNegative(arr);

		if (index!=-1) {
			System.out.println("First negative number found at index: "+index);
		}
		else {
			System.out.println("No negative number found");
		}
	}
}
