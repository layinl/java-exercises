package br.com.alura.recipeapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * The Recipe API program uses themealdb REST API to search for any recipe
 * that you input
 */
public class Main {

  void main() throws IOException, InterruptedException {
    // no secret API Key now, thank Lord
    String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

    System.out.println("Please type the meal to search the recipe:");
    url += new Scanner(System.in).nextLine();

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .build();
    HttpResponse<String> response = client
      .send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }

}
