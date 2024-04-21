package youtube;

import java.util.Arrays;

/**
 * Write a java program to check whether given string are anagrams or not
 * 
 * i/p: java & avaj : if both are same then we can say it as anagrams o/p: true
 * 
 * 
 * @author HariPrasad
 */
public class Anagrams {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "avaj";
		System.out.println(anagramCheck(s1, s2));

	}

	private static boolean anagramCheck(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1); // aajv
		Arrays.sort(ch2); // aajv

		return Arrays.equals(ch1, ch2);
	}
}
