package fg;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
        String course1 = "SENG114";
        String course2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a course name: ");
        course2 = keyboard.nextLine();
        char current1, current2;
        String unSensetive = course2.toUpperCase();
        int ch;
        boolean isSame = true;
        for (ch =0; ch < course1.length(); ch++)
         {
        	 current1 = course1.charAt(ch);
        	 current2 = unSensetive.charAt(ch);
        	 if(current1<current2) {
        		 isSame = false;
        		 System.out.println("The first string comes first");}
        	 if(current1>current2) {
        		 isSame=false;
        		 System.out.println("The second string comes first");}
        		 
        		 
         }     
         if(isSame == true)
        	 System.out.println(course1 + course2);
	}

}
