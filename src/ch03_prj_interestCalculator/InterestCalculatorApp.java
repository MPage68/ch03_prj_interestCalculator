package ch03_prj_interestCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the interest calculator");
		Scanner sc = new Scanner(System.in);
		// variables
		BigDecimal interestRate = new BigDecimal(0.0);
		BigDecimal interest = new BigDecimal(0.0);
		BigDecimal loanAmount = new BigDecimal(0.0);
		String interestDisplay = "";
		String loanAmountDisplay = "";
		String interestRateDisplay = "";
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		percentFormat.setMaximumFractionDigits(2);
		String choice = "y";
		// while loop
		while (!choice.equalsIgnoreCase("n")) {
			// logic
			System.out.print("Enter loan amount:\t");
			loanAmount = sc.nextBigDecimal();
			System.out.print("Enter interest rate:\t");
			interestRate = sc.nextBigDecimal().divide(new BigDecimal(100));
			interest = loanAmount.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
			interestDisplay = NumberFormat.getCurrencyInstance().format(interest);
			loanAmountDisplay = NumberFormat.getCurrencyInstance().format(loanAmount);
			interestRateDisplay = percentFormat.format(interestRate);
			// user output
			System.out.println("Loan amount:\t" + loanAmountDisplay + "\n" + "Interest rate:\t" + interestRateDisplay
					+ "\n" + "Interest:\t" + interestDisplay);
			System.out.print("Continue\t(y/n)");
			choice = sc.next();
//Goodbye, scanner close
		}
		System.out.println("Goodbye");
		sc.close();

	}
}
