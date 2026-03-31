import java.util.HashMap;

public class PairWithGivenSum {

	//method to check if pair exists
	public static boolean checkPair(int[] arr,int target) {

		HashMap<Integer,Boolean> map= new HashMap<>();

		for (int i=0;i<arr.length;i++) {

			int current= arr[i];
			int required= target-current;

			if (map.containsKey(required)) {
				System.out.println("Pair found: "+required+" + "+current+" = "+target);
				return true;
			}

			map.put(current,true);
		}

		System.out.println("No pair found with sum "+target);
		return false;
	}

	public static void main(String[] args) {

		int[] arr= {8,7,2,5,3,1};
		int target= 10;

		checkPair(arr,target);
	}
}
