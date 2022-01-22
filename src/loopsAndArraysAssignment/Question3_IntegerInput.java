// Approach 2 : Program using number input instead of String input
package loopsAndArraysAssignment;

import java.util.Scanner;

public class Question3_IntegerInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] brandSamsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] brandGoogle = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] brandApple = { "Iphone 12", "Iphone 12 Mini", "Iphone 11", "Iphone 11 Mini" };

		System.out.println("Available phone brands are listd below :	");
		System.out.println("1. Apple\n2. Google\n3. Samsung");
		System.out.println("Select the corresponding number for the brand name that you are looking for :	");

		int brandName = input.nextInt();
		boolean isBrandValid = true;
		boolean isProductAvailable = false;
		String productChosen = "";

		switch (brandName) {
		case 1:
			System.out.println("You've selected Apple. Available products are listed below: ");
			for (int i = 0; i < brandApple.length; i++) {
				System.out.println((i + 1) + ". " + brandApple[i]);
			}
			System.out.println("Enter the corresponding number of the product that you are interested in :	");
			int productApple = input.nextInt();
			for (int i = 0; i < brandApple.length; i++) {
				if (productApple == (i + 1)) {
					isProductAvailable = true;
					productChosen = brandApple[i];
				}
			}
			break;
		case 2:
			System.out.println("You've selected Google. Available products are listed below: ");
			for (int i = 0; i < brandGoogle.length; i++) {
				System.out.println((i + 1) + ". " + brandGoogle[i]);
			}
			System.out.println("Enter the corresponding number of the product that you are interested in :	");
			int productGoogle = input.nextInt();
			for (int i = 0; i < brandGoogle.length; i++) {
				if (productGoogle == (i + 1)) {
					isProductAvailable = true;
					productChosen = brandGoogle[i];
				}
			}
			break;
		case 3:
			System.out.println("You've selected Samsung. Available products are listed below: ");
			for (int i = 0; i < brandSamsung.length; i++) {
				System.out.println((i + 1) + ". " + brandSamsung[i]);
			}
			System.out.println("Enter the corresponding number of the product that you are interested in :	");
			int productSamsung = input.nextInt();
			for (int i = 0; i < brandSamsung.length; i++) {
				if (productSamsung == (i + 1)) {
					isProductAvailable = true;
					productChosen = brandSamsung[i];
				}
			}
			break;
		default:
			System.out.println("Invalid entry. Please enter a valid brand name");
			isBrandValid = false;
			break;
		}
		
		if (isBrandValid) {
		System.out.println((isProductAvailable) ? ("Product selected is : " + productChosen)
				: "Invalid entry. Please select a product available from the list");
		}
		
		input.close();
	}

}
