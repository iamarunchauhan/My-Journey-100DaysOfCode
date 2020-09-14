//Program in Java to check if the strings are Anagram or not

package BasicPrograms;

import java.util.*;

public class anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String 1 : ");
		String str1 = sc.next();
		
		System.out.print("Enter String 2 : ");
		String str2 = sc.next();
		
		//Converted strings into an arrays
		char[] arr1 = str1.toCharArray();	
		char[] arr2 = str2.toCharArray();
		
		//Sorted both the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Converted back char array into a string
		String s1 = new String(arr1);
		String s2 = new String(arr2);
		
		//Checking if it's equal or not
		if(s1.equals(s2)) {
			System.out.println("String are Anagrams");
		} else {
			System.out.println("Not an Anagram");
		}
	}

}
