//Program in Java to check if the string is Palindrome or not

package BasicPrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		
		String s = sc.next();
		
		int i = 0;
		int j = s.length() - 1;
		
		int flag = 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))
			{
				System.out.println(s +" is not a Palindrome !");
				flag = 0;
				break;
			}	
			else {
				i++;
				j--;
			}
		}
		
		if(flag == 1)
			System.out.println(s +" is a Palindrome !");
		
		
		
		/*
		 * String reverse = new StringBuffer(str).reverse().toString();
		 * 
		 * System.out.println(str); System.out.println(reverse);
		 * 
		 * if(str.equals(reverse)) { System.out.println(str +" is a Palindrome !"); }
		 * else { System.out.println(str +" is not a Palindorme !"); }
		 */
		
		
	}

}
