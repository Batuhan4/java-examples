package fg;

public class Person {
	 private String name;
	 private String surname;
	 private int age;
	 private double salary;
	 
	 public Person(String name,String surname,int age, double salary) {
		 this.name = name;
		 this.surname = surname;
		 this.age = age;
		 this.salary = salary;
		 
	 }
	 public String getName() {
		 return name;
	 }
	 public String getSurname() {
		 return surname;
	 }
	 public int getAge() {
		 return age;
	 }
	 public double getSalary() {
	     return salary;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setSurname(String surname) {
		 this.surname = surname;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
	 // Prints all results
     public void printCreditResult(Boolean b, int capital, Person person, double installment, int month,String loanType) {
    	 
    	if(b == true) {
    			System.out.println("Congratulations "+ person.getName()+ " " +person.getSurname());
    			System.out.println("Your "+ loanType + " credit application: " + capital +" has been accepted!");
    			System.out.println("Your montly payment will be: "+ installment + " x " + month);
    			System.out.println("Repayment costs = "+ installment * month);
    		    }
    	else {
    			System.out.println("We are sorry "+ person.getName()+ " " +person.getSurname());
    			System.out.println("Your "+ loanType + " credit application: " + capital +"  has been rejected because your salary is lower than the installments!");
    			System.out.println("Your salary: "+ salary + " < " + installment);
    		     }

     } 
     public void printCreditResult(int capital, Person person, double installment, int month,String loanType) {
    			System.out.println("New "+ loanType + " loan Repayment will  be: " + capital );
    			System.out.println("Your new payments will be: "+ installment + " x " +month);

     } 
     // Decision module for the loan applications
     public  void applyForLoan(Person p, int capital, int month, String loanType) {
    	double totalAmount;
    	double installment;
    	boolean isAccepted = false;
    	if(loanType.equalsIgnoreCase("vehicle")) {
    		totalAmount = Vehicle.calculateInterest(capital, p);
    	} 
    	else if(loanType.equalsIgnoreCase("mortgage")) {
    		totalAmount = Mortgage.calculateInterest(capital, p);
    	}
    	else if (loanType.equalsIgnoreCase("personal")) {
    		totalAmount = Personal.calculateInterest(capital, p);
    	}
    	else {
    		totalAmount = 0;
    	}
    	installment = totalAmount/month;
    	if(installment< p.getSalary()) {
    		isAccepted = true;
    	}
    	p.printCreditResult(isAccepted, capital, p, installment, month, loanType);

     } 
}
