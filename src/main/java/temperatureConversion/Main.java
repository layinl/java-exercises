package temperatureConversion;

import java.util.Scanner;

/**
 * The Temperature Conversion program converts the temperature in
 * Celsius to its Fahrenheit equivalent
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Please input the temperature in Celsius");
    // celsius
    final double C = new Scanner(System.in).nextDouble();
    // fahrenheit
    final double F = C * 1.8 + 32;

    System.out.printf("%.2f°C equals to %.2f°F\n", C, F);
    System.out.print("The whole number temp. is " + (int) F);
  }

}
