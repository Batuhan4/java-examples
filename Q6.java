package fg;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.print("Please enter an age: ");
		Scanner keyboard = new Scanner(System.in);
		int age =0;
		age = keyboard.nextInt();
		String identifier = "";
		switch(age) {
		case 2 : 
			identifier= "toddler";
			break;
		case 3 :
		case 4:
		case 5: 
			identifier="early childhood";
			break;
		case 6:
		case 7:
			identifier="young reader ";
			break;
		case 8:
		case 9:
		case 10:
			identifier="elementary";
			break;
		case 11:
		case 12: 
			identifier ="middle";
			break;
		case 13: 
			identifier = "impossible";
			break;
		case 14:
		case 15:
		case 16:
			identifier= "high school";
			break;
		case 17:
		case 18: 
			identifier="scholar";
			break;
		  default:
			identifier = "ineligible";
			break;
			
		}
		System.out.println(identifier);
	}

}
