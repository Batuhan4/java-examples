package fg;


public class HumanBeing implements Behavior, Comparable<HumanBeing> {
	private String name;
	private int PersonSalary;
	private int dailyStep =0;
	static int companyPopulation =0;
	private String companyName = "Google";

	 public HumanBeing(String name, int personSalary, String companyName) {
	        this.name = name;
	        this.PersonSalary = personSalary;
	        this.companyName = companyName;
	        companyPopulation++;
	    }
    public String tellName() {
    	return name;
    }
    public String tellCompanyName() {
    	return companyName;
    }
    public int tellSalary() {
    	return PersonSalary;
    }
    public int step(int actualDailyStep) {
    	dailyStep += actualDailyStep;
    	return dailyStep ;
    }
    public static int getCompanyPopulation() {
    	return companyPopulation;
    }
    @Override
    public String toString() {
        return "Name : " + name + ", Salary : " + PersonSalary + ", Step : " + dailyStep + ", Company Name : " + companyName;
    }
    @Override
    public int compareTo(HumanBeing other) {
        if (this.name.equals(other.name) && this.PersonSalary == other.PersonSalary) {
            return 10;
        } else if (!this.name.equals(other.name) && this.PersonSalary == other.PersonSalary) {
            return 0;
        } else if (!this.name.equals(other.name) && this.PersonSalary < other.PersonSalary) {
            return -1;
        } else {
            return 1;
        }
    }
    public String comparePeople(HumanBeing other) {
        int comparison = this.compareTo(other);
        if (comparison == 10) {
            return this.name + " and " + other.name + " are the same persons.";
        } else if (comparison == 0) {
            return this.name + " and " + other.name + " have same salary.";
        } else if (comparison == -1) {
            return this.name + "'s salary is smaller than " + other.name + "'s salary.";
        } else {
            return this.name + "'s salary is grater than " + other.name + "'s salary.";
        }
    }
}
