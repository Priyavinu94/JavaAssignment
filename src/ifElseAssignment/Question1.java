/* Program to print the Grade, by reading the percentage scored.
 *  Grade A, if percentage is 75 and more
 *  Grade B, if percentage is 60 and more, but less than 75
 *  Grade C, if percentage is 50 and more, but less than 60
 *  Grade D, if percentage is less than 50
 */

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
