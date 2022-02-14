package com.recursion.nfibonacci;

public class NFibo {

	public static void main(String[] args) {
		int position = 8;
		
		System.out.println(nthFibonacci(position));
	}
	
	private static long nthFibonacci(int n) {
		if (n == 0)  return 0;
		if (n == 1) return 1;
		
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
}
