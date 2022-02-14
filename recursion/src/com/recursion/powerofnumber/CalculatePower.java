package com.recursion.powerofnumber;

public class CalculatePower {
	public static void main(String[] args) {
		long num = 15;
		long power = 6;
		
		System.out.println(calculatePower(num, power));

	}

	private static long calculatePower(long num, long power) {
		
		if (power == 0) return 1;
		if (power == 1) return num;
		if (power < 0 || num < 0) return 0;
		else {
			return (num * calculatePower(num, (power - 1)));
		}
	}
}
