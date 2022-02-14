package com.recursion.recursiverange;

public class RecursiveRange {

	public static void main(String[] args) {
		
		int num = 12;
		System.out.println(recursiveRange(num));
		
	}

	private static long recursiveRange(int num) {
		
		if (num == 0) {
			return 0;
		}
		return num + recursiveRange(num-1);
	}
}
