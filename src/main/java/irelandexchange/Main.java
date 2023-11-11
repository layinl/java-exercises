package irelandexchange;

import java.util.Scanner;

/**
 * This program calculates and returns your total income deducted from
 * Income Tax related to the salary, plus your benefits.
 * <ul>
 *   <li>Less than R$ 1100.00: <b>5%</b></li>
 *   <li>Between the latter and R$ 2500.00: <b>10%</b></li>
 *   <li>More than R$ 2500.00: <b>15%</b></li>
 * </ul>
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double grossSalary, benefits, incomeTax;
		System.out.println("Please input your salary");
		grossSalary = s.nextDouble();
		System.out.println("Please input your total income from benefits");
		benefits = s.nextDouble();
		incomeTax = (grossSalary > 2500)? grossSalary * 0.15
			: (grossSalary > 1100)? grossSalary * 0.1
			: grossSalary * 0.05;

		System.out.printf(
			"Total income: %.2f",
			grossSalary - incomeTax + benefits
		);
	}

}
