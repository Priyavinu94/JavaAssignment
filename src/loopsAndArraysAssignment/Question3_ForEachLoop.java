// Program using For-Each loop
package loopsAndArraysAssignment;

import java.util.Scanner;

public class Question3_ForEachLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] brandNames = { "Apple", "Google", "Samsung" };
		String[] brandApple = { "Iphone 12", "Iphone 12 Mini", "Iphone 11", "Iphone 11 Mini" };
		String[] brandGoogle = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] brandSamsung = { "S20", "S21", "Flip3", "Fold3" };

		System.out.println("Available phone brands are listed below : ");
		for (String name : brandNames) {
			System.out.println(name);
		}
		System.out.println("Enter the brand name that you are looking for :	");
		String brandName = input.nextLine();	//variable to store brand name entered by user
		String product = "";	// variable created to store the product name entered by user
		boolean isBrandValid = true;	//boolean variable created to check condition at line 78
		boolean isProductAvailable = false;	//variable to track the availability of a product

		switch (brandName) {

		case "Apple": {
			System.out.println("You've selected Apple. Available products are listed below: ");
			for (String apple : brandApple) {
				System.out.println(apple);
			}
			System.out.println("Enter a product name from the above list :	");
			product = input.nextLine();
			for (String apple : brandApple) {
				if (product.equals(apple)) {
					isProductAvailable = true;
				}
			}
			break;
		}
		case "Google": {
			System.out.println("You've selected Google. Available products are listed below: ");
			for (String google : brandGoogle) {
				System.out.println(google);
			}
			System.out.println("Enter a product name from the above list :	");
			product = input.nextLine();
			for (String google : brandGoogle) {
				if (product.equals(google)) {
					isProductAvailable = true;
				}
			}
			break;
		}
		case "Samsung": {
			System.out.println("You've selected Samsung. Available products are listed below: ");
			for (String samsung : brandSamsung) {
				System.out.println(samsung);
			}
			System.out.println("Enter a product name from the above list :	");
			product = input.next();
			for (String samsung : brandSamsung) {
				if (product.equals(samsung)) {
					isProductAvailable = true;
				}
			}
			break;
		}
		default: {
			System.out.println("Invalid entry. Please enter a valid brand name.");
			isBrandValid = false;	//brand name is invalid
			break;
		}
		}

		if (isBrandValid) {		//if brand name is invalid, no need to print the availability of any product
			System.out.println((isProductAvailable) ? ("Product selected is : " + product)
					: "Invalid entry. Please select a product available from the list");
		}

		input.close();
	}

}
