package shubham.array;

import java.util.function.Function;

/** Find the missing number in a continous array from 1 to n 
 * HINT: Use Math sum of n natural numbers formula sum = n(n+1)/2*/

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	
		missingNum(arr);		
	}
	
	public static void missingNum(int... arr) {
		int n = 10;
		int actualSum = n*(n+1)/2;
		
		Function<int[], Integer> fn = (array) -> {
			int result = 0;
			for (int i : arr) {
				result = result + i;
			}
			return result;
		};
		
		int currentSum = fn.apply(arr);
		System.out.println(actualSum - currentSum);
		
	}
}
