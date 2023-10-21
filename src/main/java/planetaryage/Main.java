package planetaryage;

import java.util.Locale;
import java.util.Scanner;

/**
 * <p>
 *   This program converts <b>earth years</b> to a selected planet's equivalent age (Mars, Venus or Jupiter)
 * </p>
 * <p>
 *  E.g. 100 years in Earth is approximately equal to
 * </p>
 * <li>53.19 years in Mars</li>
 * <li>161.29 in Venus</li>
 * <li>8.43 in Jupiter</li>
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please input the value of earth years");
		double earthAge = scan.nextDouble();
		System.out.println("Please input the planet to estimate its equivalent age (Mars, Venus or Jupiter)");
		String planet = scan.next();

		System.out.println(
			switch (planet.toLowerCase(Locale.ROOT)) {
				case "mars" -> String.format("Mars' equivalent age: %.2f years", earthAge / 1.88);
				case "venus" -> String.format("Venus' equivalent age: %.2f years", earthAge / 0.62);
				case "jupiter" -> String.format("Jupiter's equivalent age: %.2f years", earthAge / 11.86);
				default -> "Invalid planet.";
			}
		);

		// If you're using Java 13 or later, use this code instead:
		/*
		switch (planet.toLowerCase(Locale.ROOT)) {
			case "mars":
				System.out.printf("Mars' equivalent age: %.2f years", earthAge / 1.88);
				break;
			case "venus":
				System.out.printf("Venus' equivalent age: %.2f years", earthAge / 0.62);
				break;
			case "jupiter":
				System.out.printf("Jupiter's equivalent age: %.2f years", earthAge / 11.86);
				break;
			default:
				System.out.println("Invalid planet.");
		}
		*/
		scan.close();
	}

}
