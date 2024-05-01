package br.com.alura.cryptosearch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static br.com.alura.cryptosearch.APIKey.API_KEY;

/**
 * The Crypto Search program looks for the current searched cryptocurrency
 * value based on Dollar
 */
public class Main {

  void main() throws IOException, InterruptedException {
    System.out.println("Please type the cryptocurrency you want to look up:");
    String cryptoName = new Scanner(System.in).nextLine();
    // You'll need to create the API_KEY
    String url = STR."https://api.coingecko.com/api/v3/simple/price?ids=\{cryptoName}&vs_currencies=usd&x_cg_demo_api_key=\{API_KEY}";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .build();
    HttpResponse<String> response = client
      .send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }

}
