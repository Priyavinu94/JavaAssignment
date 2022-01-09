//Program to print if an integer is positive, negative or zero using ternary operator
package ternaryOperatorExamples;

public class PositiveOrNegative {

	public static void main(String[] args) {

		int num = 0;
		String value = null;
		
		value = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
		System.out.println("Entered number is " + value);

	}
}
