package loopAssignment3;

import java.util.Scanner;

public class Que2_WhileLoop_Method1 {

	public static void main(String[] args) {

		Scanner readInt = new Scanner(System.in);

		long factorial = 1L;

		System.out.println("Enter the integer whose factorial needs to be printed");
		int num = readInt.nextInt();

		int counter = num;
		if (num == 1 || num == 0) {
			factorial = 1;
		} else {
			while (counter > 1) {
				factorial *= counter;
				counter--;
			}
		}

		System.out.println("Factorial of " + num + " = " + num + "! = " + factorial);
		readInt.close();
	}

}
