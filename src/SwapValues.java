//program to swap values in 2 different variables
public class SwapValues {

	public static void main(String[] args) {

		int a = 5, b = 10;
		System.out.println("Initial values of a and b are " + a + " and " + b);
		int swap = b; // variable swap is initialized with the value of variable b
		b = a;
		a = swap;
		System.out.println("Final values of a and b are " + a + " and " + b);
		
	}

}
