package project1;

public class Employee {
	private int baseSalary;
	private int hourlyRate;
	
	
	
	public Employee(int baseSalary) {
		super();
		setBaseSalary(baseSalary);
		setHourlyRate(0);
	}
	

	public Employee(int baseSalary, int hourlyRate) {
		super();
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
	}

	private int getHourlyRate() {
		return hourlyRate;
	}

	private void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int calculateWage(int extraHours) {
		return baseSalary +(hourlyRate*extraHours);
	}
	
	private void setBaseSalary(int baseSalary) {
		if(baseSalary <=0)
			throw new IllegalArgumentException("salary must be higher");
		this.baseSalary = baseSalary;
	}
	private int getBaseSalary() {
		return baseSalary;
	}
}
