package trafficmonitoringsystem;

import java.util.Locale;
import java.util.Scanner;

/**
 * The Traffic Monitoring System simulates a GPS app receiving
 * the traffic status and telling the user the best route option.
 * <li>Normal Traffic</li>
 * <li>Traffic Jam</li>
 * <li>Accident</li>
 */
public class Main {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		String trafficEvent = scanner.nextLine();
		String alternativeRoute = suggestAlternativeRoute(trafficEvent);

		System.out.println(alternativeRoute);
		*/
		// TODO: if you're using Java 13 or later, opt for
		//  legacySuggestAlternativeRoute() and comment
		//  suggestAlternativeRoute()
		// This will do the same thing as the code above
		System.out.print("Input traffic status: ");
		System.out.println(
			legacySuggestAlternativeRoute(
				new Scanner(System.in)
					.nextLine()
			)
		);
	}

	/**
	 * Receives the traffic event and returns the best route option
	 * @param trafficEvent the Traffic Event: Normal Traffic, Traffic
	 * Jam or Accident
	 * @return the adequate route option
	 * @implNote <b>If you're using Java 13 or later, comment this code
	 * and call <i>legacySuggestAlternativeRoute()</i> instead</b>
	 */
	private static String suggestAlternativeRoute(String trafficEvent) {
		return switch (trafficEvent.toLowerCase(Locale.ROOT)) {
			case "normal traffic" ->
				"Normal traffic on the main route. Continue on it.";
			case "traffic jam" ->
				"Avoid the main highway; use the secondary road.";
			case "accident" ->
				"Main road blocked. Use the secondary route.";
			default -> "Invalid traffic event.";
		};
	}

	/**
	 * Receives the traffic event and returns the best route option.
	 * @param trafficEvent the Traffic Event: Normal Traffic, Traffic
	 * Jam or Accident.
	 * @return the adequate route option
	 * @implNote This method uses the standard switch structure, so it
	 * will work on all Java versions
	 */
	private static String legacySuggestAlternativeRoute(String trafficEvent) {
		switch(trafficEvent.toLowerCase(Locale.ROOT)) {
			case "normal traffic":
				return "Normal traffic on the main route. Continue on it.";
			case "traffic jam":
				return "Avoid the main highway; use the secondary road.";
			case "accident":
				return "Main road blocked. Use the secondary route.";
			default:
				return "Invalid traffic event.";
		}
	}

}
