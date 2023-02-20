/**
 * 
 * @author kumar
 *
 */

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Before Revesing number: "+num);
		int rem,rev;
		rem=0; rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("After Reversing number: "+rev);
		sc.close();

	}

}
