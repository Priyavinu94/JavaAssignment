//Program to find largest of three numbers using ternary operator

package ternaryOperatorExamples;

public class LargestAmongThreeNos {

	public static void main(String[] args) {

		double num1 = 15.07;
		double num2 = 15.98;
		double num3 = 15.32;

		double max = (num1 >= num2) ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);

		System.out.println("The largest number among the three is : " + max);


	}

}
