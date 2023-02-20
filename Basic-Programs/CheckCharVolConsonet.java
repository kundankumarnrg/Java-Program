
/**
 * 
 * @author kumar
 *
 */

import java.util.Scanner;

public class CheckCharVolConsonet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any charecter: ");
		char ch = sc.next().charAt(0);
		System.out.println((ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' | ch == 'A' | ch == 'E'
				| ch == 'I' | ch == 'O' | ch == 'U') ? "Vowel" : "Consonent");
		sc.close();
	}
}
