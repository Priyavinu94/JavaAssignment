/* Take some numbers as input from console and find how many of those are even and odd numbers. 
 * 	1. Print the no of even and odd numbers entered.
 * 	2. Print the even numbers entered and odd numbers entered.
 * 
 * Approach : 1. create 2 variables - to keep count for even and odd numbers
 * 			  2. create 1 array - to store the entered numbers, in the order input received from user
 * 			  3. using forEach loop, check the array elements & update even/odd counter variables	
 * 			  4. using 2 different forEach loops, check the array elements & print even/odd numbers
 */
package loopAssignment3;

import java.util.Scanner;

public class Question1_UsingForEachLoop {

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);
		int evenCounter = 0; // variable to count even numbers from the input
		int oddCounter = 0; // variable to count odd numbers from the input

		System.out.println("Enter how many integers you want to check if even or odd");
		int numCount = inputNum.nextInt(); // variable value gives how many integers entered by user

		int[] numList = new int[numCount]; // array created to store all the input numbers

		// counter variable --- to count the iteration of the loop
		for (int counter = 1; counter <= numCount; counter++) {
			System.out.print("Enter number " + counter + " :	");
			int number = inputNum.nextInt(); // variable to hold the value entered by the user
			int i = counter - 1; // variable i created for the array indexing in line 28
			numList[i] = number;
		}
		
		for (int number : numList) {
			if (number % 2 == 0) {
				evenCounter += 1;
			} else {
				oddCounter += 1;
			}
		}
		
		System.out.println("Number of even numbers entered = " + evenCounter);
		System.out.print("They are : 	");
		for (int number : numList) {
			if (number % 2 == 0) {
				evenCounter += 1;
				System.out.print(number + "	");
			}
		}
		
		System.out.println("\nNumber of odd counters entered = " + oddCounter);
		System.out.print("They are : 	");
		for (int number : numList) {
			if (number % 2 != 0) { 	// or if (number%2 == 1)
				oddCounter += 1;
				System.out.print(number + "	");
			}
		}
		inputNum.close();

	}

}
