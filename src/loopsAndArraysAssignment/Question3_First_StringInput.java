/* Program to print all the available products present in that category, when given a phone brand name :
 * 		Apple: Iphone 12, Iphone 12 Mini, Iphone 11, Iphone 11 Mini
 * 		Google: Google Pixel 6, Google Pixel 6 Pro, Google Pixel Pro, Google Pixel 5	
 * 		Samsung : S20, S21, Flip3, Fold3
 * After displaying all the available products, ask user to enter one product name.  
 * 		If user enters a name which is present in list, print "product selected is : name of product"
 * 		Otherwise display an error message – "Please select a product from the list"
 */
package loopsAndArraysAssignment;

import java.util.Scanner;

public class Question3_First_StringInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String[] brandNames = { "Apple", "Google", "Samsung" };
		String[] brandApple = { "Iphone 12", "Iphone 12 Mini", "Iphone 11", "Iphone 11 Mini" };
		String[] brandGoogle = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] brandSamsung = { "S20", "S21", "Flip3", "Fold3" };
		
		System.out.println("Available phone brands are listed below : ");
		for (int i = 0; i < brandNames.length; i++) {
			System.out.println((i + 1) + ". " + brandNames[i]);
		}
		System.out.println("Enter the brand name that you are looking for :	");
		String brandName = input.nextLine();	//variable to store brand name entered by user
		String product = "";	// variable created to store the product name entered by user
		boolean isBrandValid = true;	//boolean variable created to check condition at line 78
		boolean isProductAvailable = false;	//variable to track the availability of a product

		switch (brandName) {

		case "Apple": {
			System.out.println("You've selected Apple. Available products are listed below: ");
			for (int i = 0; i < brandApple.length; i++) {
				System.out.println((i + 1) + ". " + brandApple[i]);
			}
			System.out.println("Enter a product name from the above list :	");
			product = input.nextLine();
			for (int i = 0; i < brandApple.length; i++) {
				if (product.equals(brandApple[i])) {
					isProductAvailable = true;
				}
			}
			break;
		}
		case "Google": {
			System.out.println("You've selected Google. Available products are listed below: ");
			for (int i = 0; i < brandGoogle.length; i++) {
				System.out.println((i + 1) + ". " + brandGoogle[i]);
			}
			System.out.println("Enter a product name from the above list :	");
			product = input.nextLine();
			for (int i = 0; i < brandGoogle.length; i++) {
				if (product.equals(brandGoogle[i])) {
					isProductAvailable = true;
				}
			}
			break;
		}
		case "Samsung": {
			System.out.println("You've selected Samsung. Available products are listed below: ");
			for (int i = 0; i < brandSamsung.length; i++) {
				System.out.println((i + 1) + ". " + brandSamsung[i]);
			}
			System.out.println("Enter a product name from the above list :	");
			product = input.next();
			for (int i = 0; i < brandSamsung.length; i++) {
				if (product.equals(brandSamsung[i])) {
					isProductAvailable = true;
				}
			}
			break;
		}
		default: {
			System.out.println("Invalid entry. Please enter a valid brand name.");
			isBrandValid = false;
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
