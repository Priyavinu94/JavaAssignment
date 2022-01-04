/*Program to determine if a person is allowed to go on a ride or not based on the  
 *Criteria: People having height less than 90 cm and more than 200 cm is not allowed
 */

package ifElseAssignment;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner readinput = new Scanner(System.in);
		
		System.out.println("Please enter your height in cms");
		float height = readinput.nextFloat();
		
		if (height>=90) {
			if(height<=200) {
				System.out.println("Enjoy the ride!!!");
			} else {
				System.out.println("Sorry...You are not allowed to go on the ride");
			}
		} else {
			System.out.println("Sorry...You are not allowed to go on the ride");
		}
		
		readinput.close();
	
	}

}
