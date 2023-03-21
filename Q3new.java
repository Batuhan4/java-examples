package fg;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter an integer: ");
            String string_number = keyboard.nextLine();

            if (string_number.equals("q")) {
                break;
            }

            int num = Integer.parseInt(string_number);

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        double result = Math.pow(Math.sqrt(min),Math.sqrt(max));
        System.out.println("Result: " + result);
    }
}
