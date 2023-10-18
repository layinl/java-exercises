package irelandexchange;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double grossSalary = s.nextDouble();
		double benefits = s.nextDouble();
		double tax = (grossSalary > 2500)? grossSalary * 0.15
			: (grossSalary > 1100)? grossSalary * 0.1
			: grossSalary * 0.05;

		System.out.printf("%.2f", grossSalary - tax + benefits);
	}

}
