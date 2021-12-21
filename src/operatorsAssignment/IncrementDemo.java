//Assignment Question #13
//program to print if the value of variable greater than zero  
package operatorsAssignment;

public class IncrementDemo {

	public static void main(String[] args) {

		int a = 1;
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(++a);

		System.out.println(a++);
		System.out.println(a++);

		System.out.println(a--);
		System.out.println(a--);

		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a--);
		
		boolean isGreaterThanZero = (a>0);
		System.out.println("The value of 'a' is greater than Zero - true or false?");
		System.out.println(isGreaterThanZero);

	}

}
