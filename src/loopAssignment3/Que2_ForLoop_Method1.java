//Program to print the factorial of a positive integer by user input
package loopAssignment3;

import java.util.Scanner;

public class Que2_ForLoop_Method1 {

	public static void main(String[] args) {

		Scanner readInt = new Scanner(System.in);

		long factorial = 1L;	//variable to store the factorial value

		System.out.println("Enter the integer whose factorial needs to be printed");
		int num = readInt.nextInt();	//variable to store user input integer

		if (num == 1 || num == 0) {
			factorial = 1;
		} else {
			for (int counter = num; counter > 1; counter--) {
				factorial *= counter;	//factorial = factorial * counter;
			}
		}

		System.out.println("Factorial of " + num + " = " + num + "! = " + factorial);
		readInt.close();
	}

}

