package planetaryage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double earthAge = s.nextDouble();
		String planet = s.next();

		/*switch (planet) {
			case "Marte":
				System.out.printf("Idade equivalente em Marte: %.2f anos", earthAge / 1.88);
				break;
			case "Venus":
				System.out.printf("Idade equivalente em Venus: %.2f anos", earthAge / 0.62);
				break;
			case "Jupiter":
				System.out.printf("Idade equivalente em Jupiter: %.2f anos", earthAge / 11.86);
				break;
			default:
				System.out.println("Planeta invalido.");
		}*/
		String out = switch (planet) {
			case "Marte" -> String.format("Idade equivalente em Marte: %.2f anos", earthAge / 1.88);
			case "Venus" -> String.format("Idade equivalente em Venus: %.2f anos", earthAge / 0.62);
			case "Jupiter" -> String.format("Idade equivalente em Jupiter: %.2f anos", earthAge / 11.86);
			default -> "Planeta invalido.";
		};

		System.out.println(out);

		s.close();
	}

}
