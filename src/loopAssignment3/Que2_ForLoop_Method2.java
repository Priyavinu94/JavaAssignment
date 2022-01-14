package loopAssignment3;

import java.util.Scanner;

public class Que2_ForLoop_Method2 {

	public static void main(String[] args) {

		Scanner readInt = new Scanner(System.in);

		long factorial = 1L;

		System.out.println("Enter the integer whose factorial needs to be printed");
		int num = readInt.nextInt();

		if (num == 1 || num == 0) {
			factorial = 1;
		} else {
			for (int counter = 2; counter <= num; counter++) {
				factorial *= counter;
			}
		}

		System.out.println("Factorial of " + num + " = " + num + "! = " + factorial);
		readInt.close();

	}

}
