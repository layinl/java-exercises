package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 * The Number Guessing Program is a game where you have to guess
 * the randomly generated number in less than 5 tries
 * @implNote Only works in Java 21
 */
public class Main {
  void main() {
    Scanner scan = new Scanner(System.in);
    final int RANDOM_NUMBER = new Random().nextInt(100);
    int number;
    System.out.println(
      """
      Number Guessing Game!
      Guess the number between 0 and 100
      """
    );
    for (int i = 0; i < 5; i++) {
      number = scan.nextInt();
      if (number != RANDOM_NUMBER)
        System.out.println(STR."The number is \{number < RANDOM_NUMBER ? "greater" : "lower"} than the random number");
      else {
        System.out.println("You win!");
        return;
      }
    }
    System.out.println("Try again");

  }
}
