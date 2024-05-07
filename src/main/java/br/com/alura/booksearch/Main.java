package br.com.alura.booksearch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static br.com.alura.booksearch.APIKey.API_KEY;

/**
 * The Book Search program searches the books by title in the Google
 * Books API
 */
public class Main {

  void main() throws IOException, InterruptedException {
    // You'll need to create this class with an API Key
    String address = STR."https://www.googleapis.com/books/v1/volumes?key=\{API_KEY}&q=";

    System.out.println("Please type the book you want to search: ");
    address += slugify(new Scanner(System.in).nextLine());

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(address))
      .build();
    HttpResponse<String> response = client
      .send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }

  /**
   * Transforms the title in a slug title, replacing all spaces with
   * hyphen characters
   * @param title the title to apply the slug
   * @return the slug string
   */
  private String slugify(String title) {
    return title.replace(' ', '-');
  }

}
