package planetaryage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double earthAge = s.nextDouble();
		String planet = s.next();

		/* 
  	 * If you're using Java 13 or later, use this code instead:
		switch (planet) {
		case "Marte":
			System.out.printf("Mars' equivalent age: %.2f years", earthAge / 1.88);
			break;
		case "Venus":
			System.out.printf("Venus' equivalent age: %.2f years", earthAge / 0.62);
			break;
		case "Jupiter":
			System.out.printf("Jupiter's equivalent age: %.2f years", earthAge / 11.86);
			break;
		default:
			System.out.println("Invalid planet.");
		}
		*/
		String out = switch (planet) {
			case "Marte" -> String.format("Mars' equivalent age: %.2f years", earthAge / 1.88);
			case "Venus" -> String.format("Venus' equivalent age: %.2f years", earthAge / 0.62);
			case "Jupiter" -> String.format("Jupiter's equivalent age: %.2f years", earthAge / 11.86);
			default -> "Invalid planet.";
		};

		System.out.println(out);

		s.close();
	}

}
