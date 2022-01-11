//using while loop
package loopAssignment2;

import java.util.Scanner;

public class Question1_Method3 {

	public static void main(String[] args) {

		String userIdSaved = "pivotAdmin";
		String passwordSaved = "Admin123";
		Scanner readCred = new Scanner(System.in);
		String userId = "";
		String password = "";

		int attemptsLeft = 3;
		while (attemptsLeft-- > 0 && !(userId.equals(userIdSaved)) && !(password.equals(passwordSaved))) {
			System.out.println(attemptsLeft+1 + " login attempt(s) remaining");
			System.out.print("Enter Username : 	");	
			userId = readCred.next();
			System.out.print("Enter Password : 	");
			password = readCred.next();
			if (userId.equals(userIdSaved) && password.equals(passwordSaved)) {
				System.out.println("You're logged into the application");
			} else {
				System.out.println("Incorrect Username or Password");
				if (attemptsLeft == 0) {
					System.out.println("No attempts left. Account is locked.");
					break;
				}
			}
		}
		readCred.close();

	}

}
