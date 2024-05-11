package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exceptions.YearFormatException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(address))
        .build();
      HttpResponse<String> response = client
        .send(request, HttpResponse.BodyHandlers.ofString());
      String json = response.body();
      System.out.println(json);
      Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();
      TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
      System.out.println(myTitleOmdb);
      Title myTitle = new Title(myTitleOmdb);
      System.out.println(
        STR."""
        Title after conversion:
        \{myTitle}
        """
      );
    } catch (YearFormatException e) {
      System.out.print(STR."A year format error ocurred → \{e.getMessage()}");
    } catch (IllegalArgumentException e) {
      System.out.println(STR.
        "An invalid url error ocurred → \{e.getMessage()}"
      );
    }

  }

}
