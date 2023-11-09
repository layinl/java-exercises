package meangrade;

import java.util.Scanner;

/**
 * This program prints if your grade mean will be either
 * <b>Failed</b>, <b>Average</b>, or <b>Approved</b>
 * based on input
 */
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your grade, from 0 to 10");
		double mean = s.nextDouble();
		if (mean < 0 || mean > 10) {
			System.out.println("Please input a valid grade mean");
			return;
		}
		System.out.println(
			(mean < 5)? "FAIL" :
			(mean < 7)? "AVG" :
				"APR"
		);
	}

}
