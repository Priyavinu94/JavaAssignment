//program to print if an integer is even or odd - using Ternary Operator

package ternaryOperatorExamples;

public class EvenOrOdd {

	public static void main(String[] args) {

		int number = 15;
		boolean IsEvenOrOdd = (number % 2 == 0);

		System.out.println(IsEvenOrOdd ? "Even number" : "Odd number");

	}

}
