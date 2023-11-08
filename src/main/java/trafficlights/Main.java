package trafficlights;

import java.util.Scanner;

/**
 * The <b>traffic lights</b> program gets a number typed by the user
 * and simulates a color warning display accordingly
 * <ol>
 *   <li>Red</li>
 *   <li>Yellow</li>
 *   <li>Green</li>
 * </ol>
 * @implNote Requires Java 13 or newer
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Please input a number from 1 to 3");
		int lightNum = 0;
		try {
			lightNum = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("Please input a number");
			e.printStackTrace();
			return;
		}
		/*

		* If you're using Java 13 or older, use this code instead:
		System.out.println((lightNum == 1)? "Stop! Red light."
			: (lightNum == 2)? "Attention! Yellow light."
			: (lightNum == 3)? "Go ahead! Green light."
			: "Invalid input! Please input '1, 2 or 3' to indicate " +
					"the traffic light's color."
		);
		*/

		// This will only work in Java 13 or newer
		System.out.println(
			switch (lightNum) {
				case 1 -> "Stop! Red light.";
				case 2 -> "Attention! Yellow light.";
				case 3 -> "Go ahead! Green light.";
				default -> "Invalid input! Please input '1, 2 or 3' to indicate " +
					"the traffic light's color.";
			}
		);
	}

}
