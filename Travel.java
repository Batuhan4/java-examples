package fg;

import java.util.Scanner;

public class Travel {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int balance;
		System.out.print("Enter your current balance: ");
		balance = keyboard.nextInt();
		if (balance < 130) {
			  System.out.println("No place to visit");
			  return;}
		if (balance >= 130) {
			  System.out.println("Places you can visit are: Istanbul");
			}
			if (balance >= 160) {
			  System.out.println("Places you can visit are: Istanbul, Antalya");
			}
			if (balance >= 200) {
			  System.out.println("Places you can visit are: Istanbul, Antalya, Bodrum");
			}
			if (balance >= 1500) {
			  System.out.println("Places you can visit are: Istanbul, Antalya, Bodrum, Paris");
			}
			if (balance >= 2000) {
			  System.out.println("Places you can visit are: Istanbul, Antalya, Bodrum, Paris, Berlin");
			}
			System.out.print("Which place you choose? ");
			String city = keyboard.next();
			int price = 0;
            city = city.toLowerCase();
			switch (city) {
			  case "istanbul":
			    price = 130;
			    break;
			  case "antalya":
			    price = 160;
			    break;
			  case "bodrum":
			    price = 200;
			    break;
			  case "paris":
			    price = 1500;
			    break;
			  case "berlin":
			    price = 2000;
			    break;
			  default:
			    System.out.println("Invalid input!");
			    return;
			    
			}
			balance -= price;
			System.out.println("Your new balance is: " + balance + " TL. Have a nice flight!");
	}
}
