package onlinepaymentsystem;

import java.util.Locale;
import java.util.Scanner;

/**
 * The Online Payment System program simulates a basic online
 * purchase transaction.
 * <br/>
 * It may be done by either Boleto (a Brazilian's
 * <s>obsolete</s> payment method) or Credit Card.
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input total value");
		double paymentAmount = scanner.nextDouble();
		scanner.nextLine(); // Consume the pending newline

		// This will only work in Java 15 or newer
		System.out.println("""
			What will be the payment method?
			 - Boleto
			 - credit_card
			""");
		switch (scanner.nextLine().toLowerCase(Locale.ROOT)) {
			case "boleto" -> processBoletoPayment();
			case "credit_card" -> processCreditCardPayment(scanner);
			default -> System.out.println("Unrecognized payment type.");
		}
	}

	/**
	 * Processes the Boleto payment (actually just prints
	 * that it was succeded for now)
	 */
	private static void processBoletoPayment() {
		System.out.println("The payment with boleto was processed" +
			" successfully.");
	}

	/**
	 * Processes the Credit Card payment, requesting card data.
	 * <br />
	 * Then, prints that the payment was successful for now.
	 * @param scanner the System.in scanner to receive user input
	 */
	private static void processCreditCardPayment(Scanner scanner) {
		String cardNumber, cardFlag, expirationDate, securityCode,
			cardholderName;
		System.out.println("Please input the card number");
		cardNumber = scanner.nextLine();
		System.out.println("Please input its flag");
		cardFlag = scanner.nextLine();
		System.out.println("Please input the card's expiration date");
		expirationDate = scanner.nextLine();
		System.out.println("Please input the security code (CVC)");
		securityCode = scanner.nextLine();
		System.out.println("Please input the name on the card");
		cardholderName = scanner.nextLine();

		// TODO: validate the card details and perform the actual payment
		// Gonna do this sh*t later. I'm too lazy for now
		System.out.println("The payment with credit card was processed " +
			"successfully.");
	}

}
