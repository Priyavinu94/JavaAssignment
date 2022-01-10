/* Program which fills a water tank to its capacity using a bucket with lesser capacity
 * in such a way it should stop the tank from overflowing 
 */
package loopAssignment1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner inputVol = new Scanner(System.in);

		System.out.print("Enter the maximum capacity of the tank in litres :	");
		int tank_Cap = inputVol.nextInt(); // input 100 for this question
		System.out.print("Enter the maximum capacity of the bucket in litres :	");
		int bucket_Cap = inputVol.nextInt(); // input 10 for this question
		System.out.print("Enter the current volume in the tank :	");
		double currentVol = inputVol.nextDouble();

		int maxFill = tank_Cap / bucket_Cap;
		int countFill = 0;
		while (countFill <= maxFill) {
			if (currentVol > (tank_Cap - bucket_Cap)) {
				break;
			} 
			currentVol += bucket_Cap;
			countFill++;
		}
		
		System.out.println("Total number of fills using bucket : " + countFill);
		System.out.println("Current Volume is "+currentVol+ " litres. Further filling causes overflowing");
		
		inputVol.close();
	}

}
