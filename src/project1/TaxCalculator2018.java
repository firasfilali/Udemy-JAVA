package project1;

public class TaxCalculator2018 implements TaxCalculator {
	private double taxableIncome;

	public TaxCalculator2018(double taxableIncome) {
		super();
		this.taxableIncome = taxableIncome;
	}
	
	@Override
	public double calculateTax() {
		return taxableIncome * 0.4;
	}

}
