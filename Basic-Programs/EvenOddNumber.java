/**
 * 
 * 
 * 	Find out odd and even number
 *  Even number: 2,4,6,8,10  [number divide by 2]
 *  Odd number: 1,3,5,7,9,11 [number not divide by 2]
 *  
 *  
 * 
 * 
 */


import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number: ");
		int val = sc.nextInt();
		
		//process-----------1:
		if(val%2==0)
			System.out.println("Even number: ");
		else 
			System.out.println("Odd number");
		
		
		//process-------------2:
		System.out.println((val%2==0) ? "Even number":"Odd number");
		sc.close();	//close object
		
	}
}
