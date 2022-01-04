// Program to determine if first integer is a multiple of 2nd, by taking two integer inputs.

package ifElseAssignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner inputint = new Scanner(System.in);

		System.out.println("Enter first integer");
		int firstInt = inputint.nextInt();
		System.out.println("Enter second integer");
		int secInt = inputint.nextInt();
		int quotient = firstInt / secInt;

		if (firstInt % secInt == 0) {
			System.out.println(firstInt + " is a multiple of " + secInt);
			System.out.println(" (" + firstInt + " = " + quotient + " * " + secInt + ")");
		} else {
			System.out.println("First integer is not a multiple of 2nd integer");
		}

		inputint.close();
	}

}
