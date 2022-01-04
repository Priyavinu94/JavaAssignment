// Program to print the Grade, by reading the percentage scored.

package ifElseAssignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner readPerc = new Scanner(System.in);

		System.out.println("Enter the percentage scored");
		double percentage = readPerc.nextDouble();

		if (percentage >= 75) {
			System.out.println("Scored A Grade");
		} else if (percentage >= 60) {
			System.out.println("Scored B Grade");
		} else if (percentage >= 50) {
			System.out.println("Scored C Grade");
		} else {
			System.out.println("Scored D Grade");
		}

		readPerc.close();

	}

}
