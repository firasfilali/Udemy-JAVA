package project1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
		int principal = (int)Console.readNumber("Principal:", 1000, 1_000_000);
		float annualInterest = (float)Console.readNumber("Annual :", 1, 30);
		byte years = (byte) Console.readNumber("Period (Years) :", 1, 30);
		
		var calculator = new MortageCalculator(principal, annualInterest, years);
		var report = new MortagageReport(calculator);
		
		report.printMortage();
		
		report.printPaymentSchedule();
		
	}
		


}
