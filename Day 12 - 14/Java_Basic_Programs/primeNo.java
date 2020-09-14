//Program in Java to check whether a number is prime or not

package BasicPrograms;

import java.util.*;

public class primeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 2; i <= num/2; ++i) {
			if(num % i == 0) {
				flag = true;
				break;
			}		
		}
		
		sc.close();
		
		if(!flag)
			System.out.println(num +" is a Prime Number");
		else
			System.out.println(num +" is not a Prime Number");
		
	}
}
