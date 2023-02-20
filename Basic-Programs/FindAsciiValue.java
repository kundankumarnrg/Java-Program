/**
 * 
 * @author kumar
 *
 */

import java.util.Scanner;

public class FindAsciiValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Charecter: ");
		char ch = sc.next().charAt(0);
		System.out.println("ASCII value of Charetecter: "+((int)ch));	
		sc.close();
	}
}
