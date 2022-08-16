package project1;

import java.text.NumberFormat;

public class MortagageReport {
	
	private static MortageCalculator calculator;
	private final NumberFormat currency;
	
	public MortagageReport(MortageCalculator calculator) {
		super();
		this.calculator = calculator;
		currency =  NumberFormat.getCurrencyInstance();
		// TODO Auto-generated constructor stub
	}

	final static byte MONTHS_IN_YEARS = 12;
	
	
	public void printMortage() {
		double mortgage = calculator.calculateMortage();
		String mortgageFormatted = currency.format(mortgage);
		System.out.println();
		System.out.println("MORTAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}
	
	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SHEDULE");
		System.out.println("---------------");
		
		for(double balance : calculator.getRemainingBalances())
			System.out.println(currency.format(balance));
	}

}
