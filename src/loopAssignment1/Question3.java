//Program to take a positive integer input from user and check if it is prime or not
package loopAssignment1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in);

		System.out.println("Enter a positive integer to be checked if prime or not");
		int num = inputInt.nextInt();
		boolean isPrime = true;
		// if num is prime, it is completely divisible by 1 and num only..
		// below loop checks if each integer from 2 to num/2 is a divisor of num or not.
		// we check until num/2, because, for any number, it is not divisible by more than its half
		for (int div = 2; div <= num/2; div++) {
			if (num % div == 0) {
				isPrime = false;
				System.out.println(num + " is divisible by " + div + ", So it's not a prime number.");
				break;
			}
		}

		if (isPrime == true) {
			System.out.println(num + " is a prime number");
		}
		inputInt.close();
	}

}
