package fg;

import java.util.Random;

public class Account
{
	private double balance;
	private String name;
	private long acctNum;

public void withdraw(double amount){
	if (balance >= amount)
		balance -= amount;
	else
		System.out.println("Insufficient funds");
}
public void withdraw(double amount, double fee) {
	if (balance >= amount + fee) {
	    balance -= fee;
		balance -= amount;
		}
	else
		System.out.println("Insufficient funds");
	
}
public Account(double initBal, String owner, long number){
	balance = initBal;
	name =owner ;
	acctNum= number;
}
public Account(double initBal, String owner) {
	balance = initBal;
	name = owner;
	acctNum = Math.abs(new Random().nextLong())%1000000;
	
}
public Account(String owner) {
	balance = 0;
	name = owner;
	acctNum = Math.abs(new Random().nextLong())%1000000;
}
public void deposit(double amount){
	balance += amount;
}
public double getBalance(){
	return balance;
}
public long getAcctNumber(){
	return acctNum;
}
public String getName(){
	return name;
}
public static Account consolidate(Account acct1, Account acct2) {
	if(acct1.getName().equals(acct2.getName())== true && acct1.getAcctNumber() != acct2.getAcctNumber() ) {
	Account acct3;
	acct3 = new Account(acct1.getBalance()+acct2.getBalance(),acct1.getName(),acct1.getAcctNumber()+ acct2.getAcctNumber());
	return acct3;
	}
	else{
		System.out.println("Failed. To consolidate 2 accounts, account owners must be same person, also two accounts can not be same");
		return null;
	}
}
public String toString(){
	return "Name:" + name + "\nAccount Number: " + acctNum +
			"\nBalance: " + balance;
}

}