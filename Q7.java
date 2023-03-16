package fg;
import java.util.Scanner;
public class Q7 {
        
	
	 public static void main(String[] args){
		 Scanner keyboard = new Scanner(System.in);
		 int num = 54;
		 int guess=0, counter = 0;
		 do {
			  System.out.print("Guess the number: ");
			  guess = keyboard.nextInt();
			  counter++;
			  if (guess < num) {
				    System.out.println("Increase your guess");
				  } else if (guess > num) {
				    System.out.println("Decrease your guess");
				  }
		 }while(guess != num);
		 System.out.println("You have found the number after " + counter + " guess.");
	 }
}
