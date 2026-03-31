import java.util.HashMap;
import java.util.ArrayList;

public class ZeroSumSubarray {

	//method to find and display zero sum subarrays
	public static void findZeroSumSubarrays(int[] arr) {

		HashMap<Integer,ArrayList<Integer>> map= new HashMap<>();

		int sum= 0;

		//initial sum 0 at index -1
		ArrayList<Integer> list= new ArrayList<>();
		list.add(-1);
		map.put(0,list);

		for (int i=0;i<arr.length;i++) {

			sum+= arr[i];

			if (map.containsKey(sum)) {

				ArrayList<Integer> indexList= map.get(sum);

				for (int startIndex:indexList) {
					System.out.println("Subarray found from index "+(startIndex+1)+" to "+i);
				}

				indexList.add(i);
			}
			else {
				ArrayList<Integer> newList= new ArrayList<>();
				newList.add(i);
				map.put(sum,newList);
			}
		}
	}

	public static void main(String[] args) {

		int[] arr= {3,4,-7,3,1,3,1,-4,-2,-2};

		findZeroSumSubarrays(arr);
	}
}
