//Program to set temperature of the thermostat by taking user input
package loopAssignment1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the desired temperature in degree Celcius");
		double temp = input.nextDouble();

		System.out.println("The temperature is set to " + temp + " degree Celcius");
		
		input.close();
	}

}
