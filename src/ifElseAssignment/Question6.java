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
		System.out.println("Enter the Promo code");
		System.out.println("(If no promo code, enter NA)");
		String promocode = inputcode.nextLine();
		
		if (promocode.equals("Promo5")) {
			System.out.println("The total discount applied on the product is "+(fixedDiscount+5)+"%" );
		} else if (promocode.equals("Promo10")) {
			System.out.println("The total discount applied on the product is "+(fixedDiscount+10)+"%" );
		} else if (promocode.equals("Promo15")) {
			System.out.println("The total discount applied on the product is "+(fixedDiscount+15)+"%" );
		} else if (promocode.equals("NA")){
			System.out.println("The total discount applied on the product is "+ fixedDiscount +"%");
		} else {
			System.out.println("Not a valid promo code. Please try again");
		}
		
		inputcode.close();
	}

}
