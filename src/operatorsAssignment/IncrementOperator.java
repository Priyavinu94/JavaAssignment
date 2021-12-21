//Assignment Question #14
//program to print if the value of variable x is even or odd
package operatorsAssignment;

public class IncrementOperator {

	public static void main(String[] args) {

		int x = 1;
		x = x++ + ++x + x++ + ++x + ++x;
		System.out.println("Value of x : " + x);

		int rem = x % 2;
		boolean isEven = (rem == 0);

		System.out.println("x is an even number - true or false?");
		System.out.println(isEven);

	}

}
