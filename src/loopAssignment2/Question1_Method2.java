// Using counter in reverse (for loop)
package loopAssignment2;

import java.util.Scanner;

public class Question1_Method2 {

	public static void main(String[] args) {

		String userIdSaved = "pivotAdmin";
		String passwordSaved = "Admin123";
		Scanner readCred = new Scanner(System.in);

		for (int attemptsLeft = 3; attemptsLeft > 0; attemptsLeft--) {
			System.out.print("Enter Username :	");
			String userId = readCred.next();
			System.out.print("Enter Password :	");
			String password = readCred.next();

			if (userId.equals(userIdSaved) && password.equals(passwordSaved)) {
				System.out.println("You're logged into the application");
				break;
			} else {
				System.out.println("Incorrect Username or Password. " + (attemptsLeft-1) +" Attempt(s) remaining ");
				if (attemptsLeft-1 == 0) {
					System.out.println("Account locked");
					break;
				}
			}
		}

		readCred.close();

	}

}
