// Program to print the largest number from three inputs

package ifElseAssignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);

		System.out.println("Enter three numbers");
		double num1 = inputNum.nextDouble();
		double num2 = inputNum.nextDouble();
		double num3 = inputNum.nextDouble();

		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println("The largest number is " + num1);
			} else {
				System.out.println("The largest number is " + num3);
			}
		} else {
			if (num2 >= num3) {
				System.out.println("The largest number is " + num2);
			} else {
				System.out.println("The largest number is " + num3);
			}
		}
		
		inputNum.close();
	}

}
