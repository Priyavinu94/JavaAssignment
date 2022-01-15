/* Program to :
 * 	1. declare an array using approach one
 *  2. Initialize the array elements
 * 	3. print the declared array
 * 	4. change the values of elements of the array and then print again
 */
package arrayPractice;

public class FirstApproach {

	public static void main(String[] args) {

		// approach one ... syntax: datatype[] arrayname = new datatype[];
		String[] subjectList = new String[3];
		int[] marks = new int[3];

		subjectList[0] = "Physics";
		subjectList[1] = "Chemistry";
		subjectList[2] = "Mathematics";
		marks[0] = 68;
		marks[1] = 82;
		marks[2] = 95;
		System.out.println("Initialised values : ");
		System.out.println("Marks Scored in " + subjectList[0] + " is : 	" + marks[0]);
		System.out.println("Marks Scored in " + subjectList[1] + " is : 	" + marks[1]);
		System.out.println("Marks Scored in " + subjectList[2] + " is : 	" + marks[2]);

		subjectList[0] = "English";
		subjectList[1] = "Second Language";
		subjectList[2] = "Computer Science";
		marks[0] = 90;
		marks[1] = 86;
		marks[2] = 99;
		System.out.println("After changing initial values : ");
		System.out.println("Marks Scored in " + subjectList[0] + " is : 	" + marks[0]);
		System.out.println("Marks Scored in " + subjectList[1] + " is : 	" + marks[1]);
		System.out.println("Marks Scored in " + subjectList[2] + " is : 	" + marks[2]);

	}

}
