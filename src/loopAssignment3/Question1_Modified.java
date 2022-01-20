/* Take some numbers from user and find how many of those are even and odd numbers. 
 * 	1. Print the no of even and odd numbers entered.
 * 	2. Print the even numbers entered and odd numbers entered.
 * 
 * Approach : 1. create 2 variables - to keep count for even and odd numbers
 * 			  2. create 2 arrays - one for Even and one for odd number
 * 			  3. when input received from user : check if even/odd, update counter variables & initialize respective arrays	
 * 			  4. print the no of even/odd numbers
 * 			  5. print the non default values contained in each array	
 */
package loopAssignment3;

import java.util.Scanner;

public class Question1_Modified {

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);
		int evenCounter = 0; // variable to count even numbers from the input
		int oddCounter = 0; // variable to count odd numbers from the input

		System.out.println("Enter how many integers you want to check if even or odd");
		int numCount = inputNum.nextInt(); // variable value gives how many integers entered by user

		int[] evenNumList = new int[numCount]; // array created to store the even numbers
		int[] oddNumList = new int[numCount]; // array created to store the odd numbers

		// counter variable --- to count the iteration of the loop
		// number variable --- to hold the value entered by the user on each iteration
		for (int counter = 1; counter <= numCount; counter++) {
			System.out.print("Enter number " + counter + " :	");
			int number = inputNum.nextInt();
			int i = counter - 1; // variable i created for the array indexing at line 31 and line 34
			if (number % 2 == 0) {
				evenCounter += 1;
				evenNumList[i] = number;
				// if number is even, it is stored in the array at corresponding index, other
				// index will have default value zero
			} else {
				oddCounter += 1;
				oddNumList[i] = number;
				// if number is odd, it is stored in the array at corresponding index, other
				// index will have default value zero
			}
		}
		System.out.println("Number of even numbers entered = " + evenCounter);
		System.out.print("They are : 	");
		for (int i = 0; i < numCount; i++) {
			if (evenNumList[i] != 0) { // checks for non default value, thus only printing even numbers
				System.out.print(evenNumList[i] + "	");
			}
		}
		System.out.println("\nNumber of odd numbers entered = " + oddCounter);
		System.out.print("They are : 	");
		for (int i = 0; i < numCount; i++) {
			if (oddNumList[i] != 0) { // checks for non default value, thus only printing odd numbers
				System.out.print(oddNumList[i] + "	");
			}
		}

		inputNum.close();

	}

}
