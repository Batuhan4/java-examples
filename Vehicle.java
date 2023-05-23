package fg;

public class Vehicle extends Loan {
	final static double RATE = 0.4495;
    public static double creditRiskFee(int age, double capital) {
    	if(age >=35 && age <=60) {
    		return 0;
    	}
    	else {
    		return 0.11 * capital *(RATE/12);
    	}
    }
    public static double calculateInterest(int capital,Person person) {
    	return (capital + creditRiskFee(person.getAge(),capital))* (1+RATE);
    }
	public double restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments)
	 {
		double total3=0;
		double installment =0;
		total3 = super.restructuringLoan(newMonthNumber, person, remainingInstallments);
	    int total = (int)total3; 
		double interest = Vehicle.calculateInterest(total, person);
		installment = interest/newMonthNumber;
		person.printCreditResult( (int)interest, person, installment, newMonthNumber, "Vehicle");
		return 0;	
	 }
}

