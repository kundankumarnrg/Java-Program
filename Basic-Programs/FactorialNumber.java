/**
 * 
 * @author kumar
 *
 */

public class FactorialNumber {

	public static void main(String[] args) {
		int num, fact; num=5; fact=1;
		while(num>0) {
			fact=fact*num;
			num-=1;
		}
		System.out.println("Factorial number: "+fact);
	}
}
