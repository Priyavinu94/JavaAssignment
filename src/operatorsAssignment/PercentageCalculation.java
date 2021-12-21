//Assignment Question #15
//program to calculate the percentage obtained in a subject, provided the marks scored.
package operatorsAssignment;

public class PercentageCalculation {

	public static void main(String[] args) {
		
		int markMath = 75;
		int markSci = 55;
		int markOS = 80;
		int markDWH = 75;
		double totalScore = 100;
		System.out.println("Enter the marks in Mathematics...  "+markMath);
		System.out.println("Percentage in Mathematics is   "+ (markMath/totalScore*100)+" %");
		System.out.println();
		System.out.println("Enter the marks in Science...  "+markSci);
		System.out.println("Percentage in Science is   "+ (markSci/totalScore*100)+" %");
		System.out.println();
		System.out.println("Enter the marks in Operating Systems...  "+markOS);
		System.out.println("Percentage in Operating Systems is   "+ (markOS/totalScore*100)+" %");
		System.out.println();
		System.out.println("Enter the marks in Data ware house...  "+markDWH);
		System.out.println("Percentage in Data ware house is   "+ (markDWH/totalScore*100)+" %");
		System.out.println();
	}

}
