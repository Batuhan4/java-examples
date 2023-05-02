package fg;

import java.util.Scanner;
public class TestAccounts2 {
	public static void main(String[] args)
	{
		Account acct;
		Account acct2;
		Account acct3;
		Account acctConsolidated;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name for first account: ");
		String name = scan.nextLine();
		acct = new Account(100,name,1000);
		System.out.println("First account: ");
		System.out.println(acct);
		
		System.out.println("Enter name for second account: ");
		name = scan.nextLine();
		acct2 = new Account(100,name,1100);
		System.out.println("Second account: ");
		System.out.println(acct2);
		
		System.out.println("Enter name for third account: ");
		name = scan.nextLine();
		acct3 = new Account(100,name,1500);
		System.out.println("Third account: ");
		System.out.println(acct3);
		
		System.out.println("Trying to consolidate second and third accounts.");
		acctConsolidated = Account.consolidate(acct2, acct3);
		if(acctConsolidated == null) {
			// no need to do anything since we print error message inside method 
		}
		else {
		System.out.println("Result account is : ");
		System.out.println(acctConsolidated);
	}
		}
}
