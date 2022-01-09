/* Program to print the Grade, by reading the percentage scored - using Ternary Operator
 *  Grade A, if percentage is 75 and more
 *  Grade B, if percentage is 60 and more, but less than 75
 *  Grade C, if percentage is 50 and more, but less than 60
 *  Grade D, if percentage is less than 50
 */
package ternaryOperatorExamples;

public class PrintGrade {

	public static void main(String[] args) {
		
		double percent = 50, p = percent;
		// p is declared just to easily use with ternary operator in line 18
		char grade = ' ';
		
		System.out.println("The percentage scored is : " + percent);
		grade = (p >= 75) ? 'A' : (p >= 60) ? 'B' : (p >= 50) ? 'C' : 'D';
		System.out.println("Grade is " + grade);

	}

}
