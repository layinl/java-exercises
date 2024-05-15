package br.com.alura.screenmatch.requests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TitleRequest {

  public static String sendRequestByTitle(String title) throws IOException, InterruptedException {
    String address = STR."https://www.omdbapi.com/?t=\{title}&apikey=7e7539a";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(address))
      .build();
    HttpResponse<String> response = client
      .send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
  }

}
