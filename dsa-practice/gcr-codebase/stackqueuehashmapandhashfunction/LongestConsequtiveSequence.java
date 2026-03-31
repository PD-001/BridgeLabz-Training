import java.util.HashSet;

public class LongestConsequtiveSequence {

	//method to find longest consecutive sequence length
	public static int findLongestSequence(int[] arr) {

		HashSet<Integer> set= new HashSet<>();

		//store all elements in set
		for (int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}

		int longest= 0;

		//check for sequence start
		for (int i=0;i<arr.length;i++) {

			int current= arr[i];

			//start only if previous number does not exist
			if (!set.contains(current-1)) {

				int count= 1;

				while (set.contains(current+1)) {
					current++;
					count++;
				}

				if (count>longest) {
					longest= count;
				}
			}
		}

		return longest;
	}

	public static void main(String[] args) {

		int[] arr= {100,4,200,1,3,2};

		int result= findLongestSequence(arr);

		System.out.println("Longest consecutive sequence length: "+result);
	}
}
