/**
 * 
 * @author kumar
 *
 *	
 *
 */

import java.util.Scanner;

public class SumNatualNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int val = sc.nextInt();
		int sum=0;
		for(int i=0;i<=val; i++)
			sum=sum+i;		
		System.out.println("Sum of natural number: "+sum);
		sc.close();
	}
}
