package fg;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius, height, volume;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the radius:");
		radius = keyboard.nextDouble();
		System.out.print("Please enter the height:");
		height = keyboard.nextDouble();

		volume = PI * radius* radius * height;
		System.out.println("The volume of the cylinder is " + (int) volume);
	}

}
