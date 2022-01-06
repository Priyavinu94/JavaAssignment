/* Program to print the license issued based on entering the age and current level of license holding
 *  - No license issued if age is less than 16
 *  - G1 is issued : when age is more than 16 and passed G1 test
 *  - G2 is issued : when age is more than 16 and passed G2 test
 *  - G is issued : when age is more than 16 and passed G test
 */

package ifElseAssignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner readvalue = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = readvalue.nextInt();
		
		if (age<16) {
			System.out.println("You're not eligible for holding a driver's license");
		} else {
			System.out.println("Please enter current level of license you're holding");
			String license = readvalue.next();
			
			if (license.equals("G1")||license.equals("g1")) {
				System.out.println("You'll be issued with G1 license");
			} else if (license.equals("G2")||license.equals("g2")) {
				System.out.println("You'll be issued with G2 license");
			} else if (license.equals("G")||license.equals("g")) {
				System.out.println("You'll be issued with G license");
			} else {
				System.out.println("Enter valid input for current level of license");
			}
		}		
		
		readvalue.close();

	}

}
