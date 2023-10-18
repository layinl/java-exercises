package trafficmonitoringsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String trafficEvent = scanner.nextLine();

		String alternativeRoute = suggestAlternativeRoute(trafficEvent);

		System.out.println(alternativeRoute);

	}

	private static String suggestAlternativeRoute(String trafficEvent) {
		return switch (trafficEvent) {
			/*
				ToDo: Implement logic to suggest alternative routes based on traffic events
        Here, you should add logic to determine alternative routes based on the provided traffic event.
        Return a suitable suggestion or message
			*/
			case "Normal Traffic" -> "Normal traffic on the main route. Continue on it.";
			case "Congestion" -> "Avoid the main highway; use the secondary road.";
			case "Accident" -> "Main road blocked. Use the secondary route.";
			default -> "Invalid traffic event.";
		};
	}

}
