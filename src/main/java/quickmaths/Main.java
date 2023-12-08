package quickmaths;

import java.util.Scanner;

/**
 * This program receives two numbers and may output any function you
 * call in this code
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first number");
		double a = sc.nextDouble(), b;
		System.out.println("Please input the second number");
		b = sc.nextDouble();

		System.out.println("What operation will you do?\n" +
			"'sum', 'multiply', 'average'");
		String operation = sc.next().toLowerCase();
		System.out.println("Result: " + (
			switch(operation) {
				case "sum" -> sum(a, b);
				case "multiply" -> multiply(a, b);
				case "average" -> average(a, b);
				default -> "Invalid input";
			}
		));

	}

	/**
	 * Receives two numbers and returns its sum
	 * @param a the first number
	 * @param b the second number
	 * @return their sum
	 */
	public static double sum(double a, double b) {
		return a + b;
	}

	/**
	 * Receives two numbers and returns its product
	 * @param a the first number
	 * @param b the second number
	 * @return their product
	 */
	public static double multiply(double a, double b) {
		return a * b;
	}

	/**
	 * Receives two numbers and returns the average
	 * @param a the first number
	 * @param b the second number
	 * @return their average
	 */
	public static double average(double a, double b) {
		return (a + b) / 2;
	}

}
