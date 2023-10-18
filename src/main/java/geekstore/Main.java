package geekstore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double mean = s.nextDouble();
		System.out.println(
			(mean < 5)? "REP" :
			(mean < 7)? "MED" : "APR"
		);
	}

}
