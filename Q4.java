package fg;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the date in the format mm/dd/yyyy: ");
		String date = keyboard.nextLine();
		String[] splitter = date.split("/");
		System.out.print("\nThe date you entered is: " + splitter[1] + "." + splitter[0] + "." + splitter[2]);
	}

}
