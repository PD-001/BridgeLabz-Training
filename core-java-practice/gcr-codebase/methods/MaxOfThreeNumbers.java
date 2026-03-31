package methods;

import java.util.Scanner;

public class MaxOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int[] nums= new int[3];

		for(int i=0;i<nums.length;i++) nums[i]= sc.nextInt();

		int maximum= findMaximum(nums);

		System.out.println("Maximum of the three numbers is: " + maximum);

		sc.close();
	}
	public static int findMaximum(int[] nums) {
		int max= nums[0];

		if (nums[1]>max) {//if num 2 is > max
			max= nums[1];
		}
		if (nums[2]>max) {//if num 3 is > max
			max= nums[2];
		}

		return max;
	}
}
