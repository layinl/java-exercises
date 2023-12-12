package pickylistprinter;

import java.util.Scanner;

/**
 * This programs receives 10 lines and outputs the second, seventh and
 * ninth line.
 * <br/>
 * <br/>
 * ...yeah
 */
public class Main {

	public static void main(String[] args) {
		// TODO: make informational prints, dummy!
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];

		for(int i = 0; i < 10; i++)
			names[i] = sc.nextLine();
		System.out.println(
			names[2] + '\n'
			+ names[6] + '\n'
			+ names[8] + '\n'
		);
	}

}
