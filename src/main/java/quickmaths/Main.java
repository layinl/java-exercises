package quickmaths;

import java.util.Scanner;

/**
 * This program receives two numbers and may output any function you
 * call in this code
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();

		System.out.printf("MEDIA = %.5f\n", (a * 3.5 + b * 7.5) / 11);

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
