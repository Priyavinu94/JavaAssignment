/* Program to calculate the commission rate based on sales percentage achieved:
 *  - Up to 50% of sales target achieved, the commission is 1%
 *  - Less than 70% of sales target achieved, the commission is 5%
 *  - More than 70% of sales target achieved, the commission is 10%
 */

package ifElseAssignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the percentage of sales target achieved");
		double salesperc = input.nextDouble();
		
		if (salesperc < 50) {
			System.out.println("Will receive 1% sales commission");
		} else if (salesperc < 70) {
			System.out.println("Will receive 5% sales commission");
		} else {
			System.out.println("Will receive 10% sales commission");
		}
		
		input.close();
	}

}
