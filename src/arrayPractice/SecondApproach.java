/* Program to :
 * 	1. declare and initialize an array using approach two
 * 	2. print the declared array
 * 	3. change the values of elements of the array and then print again
 */
package arrayPractice;

public class SecondApproach {

	public static void main(String[] args) {

		//approach two: ... syntax: datatype[] arrayname = {arrayname[0],arrayname[1],..,arrayname[n-1]}
		//							where n is the length of the array
		
		String[] candidateName = {"Renu", "Divya","Chitra","Maya"};
		int[] age = {30,19,28,21};
		System.out.println("Initialized values :");
		System.out.println(candidateName[0] + " : "+age[0]+" years");
		System.out.println(candidateName[1] + " : "+age[1]+" years");
		System.out.println(candidateName[2] + " : "+age[2]+" years");
		System.out.println(candidateName[3] + " : "+age[3]+" years");
		
		candidateName[0] = "Riya";
		candidateName[1] = "Deepti";
		candidateName[2] = "Priya";
		candidateName[3] = "Navya";
		age[0] = 29;
		age[1] = 20;
		age[2] = 27;
		age[3] = 25;
		
		System.out.println("After changing the array values :");
		System.out.println(candidateName[0] + " : "+age[0]+" years");
		System.out.println(candidateName[1] + " : "+age[1]+" years");
		System.out.println(candidateName[2] + " : "+age[2]+" years");
		System.out.println(candidateName[3] + " : "+age[3]+" years");
		
	}

}
