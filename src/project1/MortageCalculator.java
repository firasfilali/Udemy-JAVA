package project1;

public class MortageCalculator {
	//instance fields
	private int principale;
	private float annualInterest; 
	private byte years;
	
	//static fields
	private final static byte MONTHS_IN_YEARS = 12;
	private final static byte PERCENT = 100;
	
	
	//constructor
	public MortageCalculator(int principale, float annualInterest, byte years) {
		super();
		this.principale = principale;
		this.annualInterest = annualInterest;
		this.years = years;
	}
	
	public double calculateMortage() {
		
		float monthlyInterest = getMonthlyInterest();
		float numberOfPayments = getNumberOfPaylents();
		double mortgage = principale * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	
		return mortgage;
	}
	public double calculatePaymentShedule(short numberOfPaymentsMade) {
	
		
		float monthlyInterest = getMonthlyInterest();
		float numberOfPayments = getNumberOfPaylents();
		
		double paymentShedule = principale * (Math.pow(1 + monthlyInterest, numberOfPayments)
				-Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) 
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	
		return paymentShedule;
	}
	
	public double[] getRemainingBalances() {
		var balances = new double[(int) getNumberOfPaylents()];
		for(short month=1;month <= balances.length;month++)
		balances[month-1] = calculatePaymentShedule(month); 
		
		return balances;
		
		
	}
	


	public void setYears(byte years) {
		this.years = years;
	}
	
	private float getMonthlyInterest() {
		return annualInterest / PERCENT / MONTHS_IN_YEARS;
	}
	
	private float getNumberOfPaylents() {
		return years * MONTHS_IN_YEARS;
	}

}
