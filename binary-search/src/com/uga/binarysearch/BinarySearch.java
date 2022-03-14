package com.uga.binarysearch;

import java.util.Arrays;
import java.util.List;

//Given an n element array index you need to find an element with log(n) complexity using binary search

public class BinarySearch {

	public static int binarySearch(Integer[] arr, int num) throws IndexOutOfBoundsException {
		
		int mid = arr.length/2;
		Arrays.sort(arr);
		List<Integer> sortedArr = Arrays.asList(arr);
		
		if (sortedArr.get(mid) == num) {
			return mid;
		} else if (num > sortedArr.get(mid)) { //means its on right half
			sortedArr = sortedArr.subList(mid+1, sortedArr.size());
			return mid + 1 + binarySearch(sortedArr.toArray(new Integer[sortedArr.size()]), num);
			
		} else { //Means its on the left half
			sortedArr = sortedArr.subList(0, mid);
			return binarySearch(sortedArr.toArray(new Integer[sortedArr.size()]), num);
		}
	}
	
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int num = 4;
		int index = 0;
		try {
			index = binarySearch(arr, num);
			System.out.println(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Not Found");
		}
		
	}
	 
}
