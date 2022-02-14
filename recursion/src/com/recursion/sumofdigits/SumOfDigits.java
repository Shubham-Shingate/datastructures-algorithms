package com.recursion.sumofdigits;

/** How to find the sum of digits in a positive integer number.*/

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 2454;
		int result = sumOfDigits(num);
		System.out.println(result);
	}
	

	private static int sumOfDigits(int num) {
		 if (num < 0) return 0;
		 if(num < 10) return num;
		 else {
			 return sumOfDigits(num/10) + num%10;
		}
	}
}
