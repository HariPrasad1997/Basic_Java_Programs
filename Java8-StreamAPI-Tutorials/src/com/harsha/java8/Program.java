package com.harsha.java8;

/**
 * Write a program to Replace the all occurances of given character from the
 * given String
 * 
 * @author HariPrasad
 */

public class Program {

	public static void main(String[] args) {

		String str = "HariPrasad";
		Character c = 'H';
		removeChar(str, c);
	}

	private static void removeChar(String str, char ch) {
		int n = str.length(); // 10
		String finalString = " ";
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != ch) {
				finalString = finalString + str.charAt(i);
			}
		}
		System.out.println(finalString);
	}
}
