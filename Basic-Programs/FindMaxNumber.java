/**
 * 
 * @author kumar
 *  a=10, b=20, c=40, d=5
 *  max no=40
 */

import java.util.Scanner;

public class FindMaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter three: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int out=((a>b)?((a>c)?a:c):(b>c?b:c));
		System.out.println("Max number is: "+ out);
		sc.close();
	}
}
