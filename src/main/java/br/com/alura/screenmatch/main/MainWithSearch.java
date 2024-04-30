package br.com.alura.screenmatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {

  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type a movie to search: ");
    var search = scan.nextLine();
    String address = STR."https://www.omdbapi.com/?t=\{search}&apikey=7e7539a";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(address))
      .build();
    HttpResponse<String> response = client
      .send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
  }

}
