//Assignment Question #15
//program to calculate the percentage obtained in a subject, provided the marks scored.package operatorsAssignment;
package operatorsAssignment;

public class PercentageCalc1 {

	public static void main(String[] args) {

		int markMath = 75;
		int markSci = 55;
		int markOS = 80;
		int markDWH = 75;
		int totalMarks = (markMath + markSci + markOS + markDWH);
		double totalScore = 100;
		System.out.println("Enter the marks in Mathematics...  " + markMath);
		System.out.println("Percentage in Mathematics is   " + (markMath / totalScore * 100) + " %");
		System.out.println();
		System.out.println("Enter the marks in Science...  " + markSci);
		System.out.println("Percentage in Science is   " + (markSci / totalScore * 100) + " %");
		System.out.println();
		System.out.println("Enter the marks in Operating Systems...  " + markOS);
		System.out.println("Percentage in Operating Systems is   " + (markOS / totalScore * 100) + " %");
		System.out.println();
		System.out.println("Enter the marks in Data ware house...  " + markDWH);
		System.out.println("Percentage in Data ware house is   " + (markDWH / totalScore * 100) + " %");
		System.out.println();
		System.out.println("Total Marks Scored is " + totalMarks);
		System.out.println("Total Percentage scored is " + (totalMarks / (4*totalScore) * 100) + " %");

	}

}
