/**
 * 
 * @author kumar
 *
 */
import java.util.Scanner;

public class CountNumDigiteInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Integer Number: ");
		int val = sc.nextInt();
		int count=0;
		while(val>0) {
			val=val/10;
			count = count+1;
		}
		System.out.println("Number of digits: "+count);
		sc.close();
	}
}
