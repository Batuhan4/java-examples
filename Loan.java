package fg;

public  class Loan {
	
	public static double calculateInterest(int capital,Person person) {
		return 0;
	} //Calculates Interest Fees
	public static double creditRiskFee(int age, double capital) {
		return 0;
	} // It will calculate the risk fee for loan application
	public double restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments)
	 {
		double total=0;
		for(int i = 0;i<remainingInstallments.length ;i++)
		{
			total = remainingInstallments[i] + total;
		}
		return total;
		
	 }
}
