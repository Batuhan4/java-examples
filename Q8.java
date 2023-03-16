package fg;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		int n =0;
		System.out.print("Enter a key: ");
		Scanner keyboard = new Scanner(System.in);
		String key = keyboard.nextLine();
		System.out.print("\nEnter an integer: ");
		n = keyboard.nextInt();
		String backwardsKey = "";
		for (int i = key.length() - 1; i >= 0; i--) {
            char c = key.charAt(i);
            for (int j = 0; j < n; j++) {
                backwardsKey += c;
            }
	}
	System.out.println(backwardsKey);
}
}
