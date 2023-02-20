/**
 * 
 * @author kumar
 *
 *Add two integer values
 *
 *
 */
import java.util.Scanner;
public class AddTwoIntVal {

	public static void main(String[] args) {
		// without using keyword
		int a=10;
		int b=20;
		System.out.println("Sum of two number: "+(a+b));
		
		
		//With keyBoard input values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first interger value: ");
		int val1 = sc.nextInt();
		System.out.println("Enter second integer value: ");
		int val2 = sc.nextInt();
		System.out.println("Sum of Two int val: "+(val1+val2));
		sc.close();

	}

}
