package com.recursion.factorial;

public class Factorial {
	
	public static void main(String[] args) {
		int num = 0;
		System.out.println(getfactorial(num));
	}

	private static long getfactorial(int num) {
		if (num < 0) return 0;
		if (num == 1 || num == 0) return 1;
		return num * getfactorial(num-1);
	}
	
	
}
