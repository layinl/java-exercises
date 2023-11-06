package library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Book book1 = new Book(s.nextLine(), s.nextDouble(), s.nextInt());
		s.nextLine();
		Book book2 = new Book(s.nextLine(), s.nextDouble(), s.nextInt());
		System.out.printf("Valor total da compra: %.2f"
			+ "\nNúmero de livros comprados: " + (book1.quantity + book2.quantity)
			+ "\nObrigado por comprar na nossa livraria!%n", book1.getFullPrice() + book2.getFullPrice());
	}


	static class Book extends library.Book {

		public Book(String title, Double price, Integer quantity) {
			super(title, price, quantity);
		}

	}

}
