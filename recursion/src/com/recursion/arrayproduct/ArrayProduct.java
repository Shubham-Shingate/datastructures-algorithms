package com.recursion.arrayproduct;

public class ArrayProduct {
	
	public static void main(String[] args) {
		
		int[] intArr = {5,-5,-5};

		System.out.println(arrayProduct(0, intArr));
		
	}

	private static long arrayProduct(int startIndex, int... arr) {
		
		if (startIndex == (arr.length-1)) {
			return arr[startIndex];
		}
		
		return arr[startIndex] * arrayProduct(startIndex+1, arr);
	}
	
	
}
