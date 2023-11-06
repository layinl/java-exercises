package library;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

/**
 * This program simulates a standard library's checkout, where you
 * can insert info of the books to buy
 * <ul>
 *  <li>title</li>
 *  <li>price</li>
 *  <li>quantity</li>
 * </ul>
 *
 * You may input as many as you want
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title, isContinue;
		double price, totalPrice = 0;
		int quantity, totalQuantity = 0;
		Set<Book> books = new HashSet<>();
		//  Book: { title, price, quantity }
		do {
			System.out.println("Please input the book's title");
			// Had to do the title scan this way because for some reason
			// this f***ing method catches the new line separator from the
			// previous input and skips the title input
			title = new Scanner(System.in).nextLine();
			System.out.println("Please input the book's price");
			price = scan.nextDouble();
			System.out.println("Please input the quantity");
			quantity = scan.nextInt();
			books.add(new Book(title, price, quantity));
			System.out.println("Do you want to add another book? Type Y to continue");
			isContinue = scan.next();
		} while (isContinue.equalsIgnoreCase("y"));

		for(Book book : books) totalPrice += book.getFullPrice();
		for(Book book : books) totalQuantity += book.getQuantity();

		System.out.print(
			"Total price: " + String.format("%.2f", totalPrice)
			+ "\nNumber of books bought: " + totalQuantity
			+ "\nThank you for shopping in our library!"
		);

	}

}
