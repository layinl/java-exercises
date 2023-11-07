package emailsending;
import java.util.Scanner;

/**
 * This program simulates an e-mail sending and receiving.
 * <li>Send: Prints out the message with the receiver</li>
 * <li>Receive: It only prints that the inbox is empty</li>
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("""
			What do you want to do?
			'Send' e-mail
			'Receive' e-mail
			""");
		String  command = scanner.nextLine();

		if ("Send".equalsIgnoreCase(command)) {
			if (scanner.hasNextLine()) {
				System.out.println("Please input the receiver e-mail");
				String receiver = scanner.nextLine();
				if (scanner.hasNextLine()) {
					System.out.println("Please input the message");
					String message = scanner.nextLine();
					sendEmail(receiver, message);
				} else {
					System.out.println("Invalid Command.");
				}
			} else {
				System.out.println("Invalid Command.");
			}
		} else if ("Receive".equalsIgnoreCase(command)) {
			receiveEmail();
		} else {
			System.out.println("Invalid Command.");
		}

	}

	/**
	 * Prints the 'e-mail sent' message along with the receiver
	 * @param receiver the receiver e-mail that will get
	 *                 the message
	 * @param message the e-mail body
	 */
	private static void sendEmail(String receiver, String message) {
		System.out.println("Email sent to " + receiver + " successfully!\n" +
			message);
	}

	/**
	 * Only prints 'Empty inbox' for now
	 */
	private static void receiveEmail() {
		System.out.println("Empty Inbox.");
	}

}