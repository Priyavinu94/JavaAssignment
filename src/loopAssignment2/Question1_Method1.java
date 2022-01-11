/* Program which takes user name and password from user and compares it with credentials saved in class
 * If matches, print "You are logged in to the application", 
 * If not, print "Incorrect User id or password"
 * If login failed 3 times simultaneously, print "Account locked"
 */
package loopAssignment2;

import java.util.Scanner;

public class Question1_Method1 {

	public static void main(String[] args) {

		String userIdSaved = "pivotAdmin";
		String passwordSaved = "Admin123";
		Scanner readCred = new Scanner(System.in);

		for (int chance = 0; chance < 3; chance++) {
			System.out.print("Enter Username :	");
			String userIdInput = readCred.next();
			System.out.print("Enter Password :	");
			String passwordInput = readCred.next();

			if (userIdInput.equals(userIdSaved) && passwordInput.equals(passwordSaved)) {
				System.out.println("You're logged into the application");
				break;
			} else {
				System.out.println("Incorrect Username or Password. No of times attempted is : " + (chance + 1));
				if (chance == 2) {
					System.out.println("Account locked");
					break;
				}
			}
		}

		readCred.close();
	}

}
