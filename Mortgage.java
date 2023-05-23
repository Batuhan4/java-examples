package fg;

public class Mortgage extends Loan {
	final static double RATE = 0.3005;
    public static double creditRiskFee(int age, double capital) {
    	if(age >55) {
    		return (age-55)*0.01*capital*(RATE/12);
    	}
    	else {
    		return 0;
    	}
    }
    public static double calculateInterest(int capital,Person person) {
    	return (capital + creditRiskFee(person.getAge(),capital))* (0.9+RATE);
    }
	public double restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments)
	 {
		double total3=0;
		double installment =0;
		total3 = super.restructuringLoan(newMonthNumber, person, remainingInstallments);
	    int total = (int)total3; 
		double interest = Mortgage.calculateInterest(total, person);
		installment = interest/newMonthNumber;
		person.printCreditResult( (int)interest, person, installment, newMonthNumber, "Mortgage");
		return 0;	
	 }
}
	