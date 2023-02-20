/**
 * 
 * @author kumar
 *
 */

import java.util.Scanner;

public class FindPosNegNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any number");
		int val = sc.nextInt();
		System.out.println((val>=0)?"Possitive number":"Negative number");
		sc.close();
	}
}
