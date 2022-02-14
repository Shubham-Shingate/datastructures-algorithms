package com.recursion.ispallindrome;

public class IsPalindrome {

	public static void main(String[] args) {
		String str = "PaaP";

		if (reverse(str).equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	private static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);

	}

}
