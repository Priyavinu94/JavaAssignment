//program to calculate the area and perimeter of the rectangle, provided with the dimensions


public class Rectangle {

	public static void main(String[] args) {

		double length = 10; // Length of the rectangle
		double breadth = 20; // Breadth of the rectangle

		double area = length * breadth; // Area of the rectangle
		double perimeter = 2 * (length + breadth); // Perimeter of the rectangle

		// Printing all parameters
		System.out.println("The length of the rectangle is : " + length);
		System.out.println("The breadth of the rectangle is : " + breadth);
		System.out.println("The area of the rectangle is : " + area);
		System.out.println("The perimeter of the rectangle is : " + perimeter);
	}

}
