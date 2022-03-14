package shubham.array;

import java.util.Arrays;

/**
 * Write a program to find all pairs of integers whose sum is equal to given
 * number
 **/
public class PairsTwoSum {

	public static void main(String[] args) {
		int[] resultPair = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(Arrays.toString(resultPair));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == 9) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

}
