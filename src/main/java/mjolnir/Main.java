package mjolnir;

import java.util.Scanner;

/**
 * This program receives the warrior's name and its strength
 * in Newtons to lift Mjölnir, Thor's hammer, and prints if
 * it can be lifted of not (canonically).
 */
public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		final int C = scan.nextInt();
		int n;
		String name;

		for (int i = 0; i < C; i++) {
			name = scan.next();
			scan.nextInt();
			System.out.println(
				(name.equalsIgnoreCase("thor"))? 'Y' : 'N'
			);
		}
	}

}
