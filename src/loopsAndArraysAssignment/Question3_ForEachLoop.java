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

		System.out.println("Enter the brand name that you are looking for :	");
		for (String name : brandNames) {
			System.out.println(name);
		}
		String brandName = input.nextLine();
		boolean isProductAvailable = false;

		switch (brandName) {

		case "Apple": {
			System.out.println("You've selected Apple. Available products are listed below: ");
			for (String apple : brandApple) {
				System.out.println(apple);
			}
			System.out.println("Enter a product name from the above list :	");
			String productApple = input.nextLine();
			for (int i = 0; i < brandApple.length; i++) {
				if (productApple.equals(brandApple[i])) {
					isProductAvailable = true;
				}
			}
			System.out.println((isProductAvailable == true) ? ("Product selected is : " + productApple)
					: "Invalid entry. Please select a product available from the list");
			break;
		}
		case "Google": {
			System.out.println("You've selected Google. Available products are listed below: ");
			for (String google : brandGoogle) {
				System.out.println(google);
			}
			System.out.println("Enter a product name from the above list :	");
			String productGoogle = input.nextLine();
			for (int i = 0; i < brandGoogle.length; i++) {
				if (productGoogle.equals(brandGoogle[i])) {
					isProductAvailable = true;
				}
			}
			System.out.println((isProductAvailable == true) ? ("Product selected is : " + productGoogle)
					: "Invalid entry. Please select a product available from the list");
			break;
		}
		case "Samsung": {
			System.out.println("You've selected Samsung. Available products are listed below: ");
			for (String samsung : brandSamsung) {
				System.out.println(samsung);
			}
			System.out.println("Enter a product name from the above list :	");
			String productSamsung = input.next();
			for (int i = 0; i < brandSamsung.length; i++) {
				if (productSamsung.equals(brandSamsung[i])) {
					isProductAvailable = true;
				}
			}
			System.out.println((isProductAvailable == true) ? ("Product selected is : " + productSamsung)
					: "Invalid entry. Please select a product available from the list");
			break;
		}
		default: {
			System.out.println("Invalid entry. Please enter a valid brand name.");
			break;
		}
		}

		input.close();
	}

}
