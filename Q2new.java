package fg;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the string of operations: ");
        String operators = keyboard.nextLine();
        for(int i =0; i< operators.length();i++) {
        	
            switch (operators.charAt(i)) {
            case('+'): 
            case('-'): 
            case('*'):
            case('/'): 
            	if(i==operators.length()-1) {
            		break;
            	}
            	continue;
            default:
            	System.out.println("Invalid string");
            	System.exit(0);
            	

        }}
        System.out.println("Enter the integer");
        int number = keyboard.nextInt();
        int num=0;
        double result =0;
        String string_number = Integer.toString(number);
        int numberLength = String.valueOf(number).length();
        if(operators.length()+1 != numberLength) {
        	System.out.println("The length of the integer is inappropriate");
        	System.exit(0);
        }
        result = Character.getNumericValue(string_number.charAt(0));
            for(int a =1; a< numberLength;a++) {
            	num = Character.getNumericValue(string_number.charAt(a));
            	switch (operators.charAt(a-1)) {
                    case('+'):
                    	result += num;
                    	break;
                    case('-'):
                    	result -= num;
                    	break;
                    case('*'):
                    	result *= num;
                    	break;
                    case('/'):
                    	result /= num;
                    	break;
            }
        }
        System.out.println("Result: "+ result);
	}

	}
