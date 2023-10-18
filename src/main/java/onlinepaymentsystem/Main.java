package onlinepaymentsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double paymentAmount = scanner.nextDouble();
		scanner.nextLine(); // Consume the pending newline

		//String paymentType = scanner.nextLine();

		// ToDo: Add payment processing logic for "boleto" and "credit_card" types

		switch (scanner.nextLine()) {
			case "boleto" -> processBoletoPayment();
			case "credit_card" -> processCreditCardPayment(scanner);
			default -> System.out.println("Unrecognized payment type.");
		}
	}


	private static void processBoletoPayment() {
		System.out.println("The payment with boleto was processed successfully.");
	}

	private static void processCreditCardPayment(Scanner scanner) {
		String cardNumber = scanner.nextLine();
		String expirationDate = scanner.nextLine();
		String securityCode = scanner.nextLine();
		String cardholderName = scanner.nextLine();

		// TODO: add the credit card payment processing logic
		// TODO: validate the card details and perform the actual payment

		System.out.println("The payment with credit card was processed successfully.");
	}

}
