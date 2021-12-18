/*program to perform
 * basic mathematical operations
 * on two numbers
 */

public class BasicOperations {

	public static void main(String[] args) {

		// declaring variables for 2 numbers (inputs)
		double num1 = 30.24;
		double num2 = 65.78;
		System.out.println("Enter two numbers? ");
		System.out.println("Number 1 = " + num1);
		System.out.println("Number 2 = " + num2);
		// declaring variables for outputs - Sum, Difference and Product of 2 numbers
		double sum = num1 + num2;
		System.out.println("Sum of the numbers is :" + sum);
		double diff = num1 - num2;
		System.out.println("Difference of the numbers is :" + diff);
		double prod = num1 * num2;
		System.out.println("Product of the numbers is : " + prod);
	}

}
