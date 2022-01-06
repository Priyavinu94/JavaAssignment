/*  Program to calculate the discount applied on a product based on the criteria
 *  - 50% discount is applied on all products
 *  - 5% discount is applied if promo code 'Promo5' is used
 *  - 10% discount is applied if promo code 'Promo10' is used
 *  - 15% discount is applied if promo code 'Promo15' is used
 */
package ifElseAssignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner inputcode = new Scanner(System.in);

		int fixedDiscount = 50;

		System.out.println("Enter the actual price of the product");
		float actualprice = inputcode.nextFloat(); // takes the product value before applying discount

		System.out.println("Enter the Promo code");
		System.out.println("(If no promo code, enter NA)");
		String promocode = inputcode.next(); // takes the Promo code
		
		//Once the promo code is entered, the new product price is calculated as -- (100-total discount)*actualprice/100 --  line 29,32,35,38
		if (promocode.equals("Promo5")) {
			System.out.println("The total discount applied on the product is " + (fixedDiscount + 5) + "%");
			System.out.println("Price after applying discount is " + (100 - (fixedDiscount + 5)) * actualprice / 100);
		} else if (promocode.equals("Promo10")) {
			System.out.println("The total discount applied on the product is " + (fixedDiscount + 10) + "%");
			System.out.println("Price applying discount is " + (100 - (fixedDiscount + 10)) * actualprice / 100);
		} else if (promocode.equals("Promo15")) {
			System.out.println("The total discount applied on the product is " + (fixedDiscount + 15) + "%");
			System.out.println("Price applying discount is " + (100 - (fixedDiscount + 15)) * actualprice / 100);
		} else if (promocode.equals("NA")) {
			System.out.println("The total discount applied on the product is " + fixedDiscount + "%");
			System.out.println("Price applying discount is " + (100 - fixedDiscount) * actualprice / 100);
		} else {
			System.out.println("Not a valid promo code. Please try again");
		}

		inputcode.close();
	}

}
