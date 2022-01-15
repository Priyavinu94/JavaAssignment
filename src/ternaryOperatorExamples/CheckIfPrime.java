//Check if an integer is prime or not, using ternary operator
package ternaryOperatorExamples;

import java.util.Scanner;

public class CheckIfPrime {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in);

		System.out.println("Enter a positive integer to be checked if prime or not");
		int num = inputInt.nextInt();
		boolean isPrime = true;
		// if num is prime, it is completely divisible by 1 and num only..
		// below loop checks if each integer from 2 to num/2 is a divisor of num or not.
		// we check until num/2, because, for any number, it is not divisible by more than its half
		for (int div = 2; div <= num / 2; div++) {
			if (num % div == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println((isPrime==true) ? "This is a Prime No" : "This is not a Prime No");
		inputInt.close();

	}

}
