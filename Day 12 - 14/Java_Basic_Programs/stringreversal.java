//Program in Java to reverse a string 

package BasicPrograms;

import java.util.*;
public class stringreversal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		
		String reverse="";
		
		//Convert string into an array
		char[] arr = s.toCharArray();
		
		//Looping from last index of array 
		for(int i = arr.length - 1; i >= 0 ; i--) {
			reverse += arr[i];
		}
		
		System.out.println(reverse);
		
		sc.close();
		
		/*
		 * -> Method 2.
		 * 
		 * byte[] sAsByteArray = s.getBytes(); 
		 * byte[] result = new byte[sAsByteArray.length];
		 * 
		 * int slen = sAsByteArray.length;
		 * 
		 * for(int i =0; i< slen; i++) { 
		 * 		result[i] = sAsByteArray[slen - i- 1]; 
		 * }
		 * 
		 * System.out.println(new String(result));
		 */

	}

}
