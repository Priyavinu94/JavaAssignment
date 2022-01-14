//Program to set temperature of the thermostat by taking user input
package loopAssignment1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double currentTemp = 18;
		
		System.out.println("Please enter the desired temperature in degree Celcius");
		double temp = input.nextDouble();
		
		if (currentTemp == temp) {
			System.out.println("Thermostat is already set at desired temperature");
		} else {
		System.out.println("The temperature is now set to " + temp + " degree Celcius");
		}
		
		input.close();
	}

}
