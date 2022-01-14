/* Take 10 numbers as input from console and find how many of those are even and odd numbers. 
 * Finally print the no of even and odd numbers entered.
 */
package loopAssignment3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);
		int evenCounter = 0;	//variable to count even numbers from the input
		int oddCounter = 0;		//variable to count odd numbers from the input

		System.out.println("Enter how many integers you want to check if even or odd");
		int integerCount = inputNum.nextInt();	//variable value gives how many integers entered by user
		
		//counter variable --- to count the iteration of the loop
		//number variable --- to hold the value entered by the user on each iteration
		
		for (int counter = 1; counter <= integerCount; counter++) {
			System.out.print("Enter number " + counter + " :	");
			int number = inputNum.nextInt();

			if (number % 2 == 0) {
				evenCounter += 1;
			} else {
				oddCounter += 1;
			}
		}
		System.out.println("Number of even numbers entered = " + evenCounter);
		System.out.println("Number of odd counters entered = " + oddCounter);
		inputNum.close();
	}

}
