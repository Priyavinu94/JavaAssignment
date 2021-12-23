//Assignment Question #15 - Using Scanner class
//program to calculate the percentage obtained in a subject, provided the marks scored 
package operatorsAssignment;

import java.util.Scanner;

public class PercentageCalc2 {

	public static void main(String[] args) {

		double totalScore = 100;
		Scanner read = new Scanner(System.in);

		System.out.println("Enter the marks in Mathematics");
		int markMath = read.nextInt();
		System.out.println("Percentage in Mathematics is   " + (markMath / totalScore * 100) + " %");

		System.out.println("Enter the marks in Science");
		int markSci = read.nextInt();
		System.out.println("Percentage in Science is   " + (markSci / totalScore * 100) + " %");

		System.out.println("Enter the marks in Operating Systems");
		int markOS = read.nextInt();
		System.out.println("Percentage in Operating Systems is   " + (markOS / totalScore * 100) + " %");

		System.out.println("Enter the marks in Data ware house");
		int markDWH = read.nextInt();
		System.out.println("Percentage in Data ware house is   " + (markDWH / totalScore * 100) + " %");
		
		int totalMarks = (markMath + markSci + markOS + markDWH);
		
		System.out.println("Total Marks Scored is " + totalMarks);
		System.out.println("Total Percentage scored is " + (totalMarks / (4*totalScore) * 100) + " %");
		
		read.close();
	}

}
