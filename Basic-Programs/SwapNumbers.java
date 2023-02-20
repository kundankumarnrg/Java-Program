/**
 * 
 * @author Kumar
 *
 *
 *	Swap Number 
 *	Input:	val1=10,	val2=30
 *	Output:	val1=30,	val2=10; 
 *
 */
class SwapCode{
	int val1 = 2;
	int val2 = 5;
	
	//Process --------------1
	void methodOne() {
		int tem=0;
		System.out.println("\nProcess------------1");
		System.out.println("Before swapping: val1="+val1+"\tval2="+val2);
		tem=val1; val1=val2; val2=tem;
		System.out.println("After swapping:  val1="+val1+"\tval2="+val2);
	}
	
	//Process-------------2
	void methodTwo() {
		System.out.println("\nProcess------------2");
		System.out.println("Before swapping: val1="+val1+"\tval2="+val2);
		val1=val1+val2;
		val2=val1-val2;
		val1=val1-val2;
		System.out.println("After swapping:  val1="+val1+"\tval2="+val2);
	}
	
	//Process-------------3
	void methodThree() {
		System.out.println("\nProcess-------------3");
		System.out.println("Before swapping: val1="+val1+"\tval2="+val2);
		val1=val1*val2;
		val2=val1/val2;
		val1=val1/val2;
		System.out.println("After swapping:  val1="+val1+"\tval2="+val2);
	}
	
	//Process---------------4
	void methodFour() {
		System.out.println("\nProcess-------------4");
		System.out.println("Before swapping: val1="+val1+"\tval2="+val2);
		val1=val1^val2;
		val2=val1^val2;
		val1=val1^val2;
		System.out.println("After swapping:  val1="+val1+"\tval2="+val2);
	}
	
	//process --------------5
	void methodFive() {
		System.out.println("\nProcess-------------5");
		System.out.println("Before swapping: val1="+val1+"\tval2="+val2);
		val2=val1+val2-(val1=val2);
		
		System.out.println("After swapping:  val1="+val1+"\tval2="+val2);
	}
}
public class SwapNumbers {

	public static void main(String[] args) {
		// First method
		SwapCode sc = new SwapCode();
		sc.methodOne();
		sc.methodTwo();
		sc.methodThree();
		sc.methodFour();
		sc.methodFive();
	}

}
