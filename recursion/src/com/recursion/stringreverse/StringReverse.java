package com.recursion.stringreverse;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Paco";
		
		System.out.println(reverse(str));
	}
	
	
	private static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}	
		return  reverse(str.substring(1)) + str.charAt(0);
		
	}
}
