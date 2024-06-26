package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exceptions.YearFormatException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import br.com.alura.screenmatch.requests.TitleRequest;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class MainWithSearch {

  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type a movie to search: ");
    var search = scan.nextLine();
//    String address = STR."https://www.omdbapi.com/?t=\{search}&apikey=7e7539a";

    try {
      String json = TitleRequest.sendRequestByTitle(search);
      System.out.println(json);

      Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
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
      System.out.print(STR.
        "An year format error ocurred → \{e.getMessage()}");
    } catch (IllegalArgumentException e) {
      System.out.println(STR.
        "An invalid url error ocurred → \{e.getMessage()}"
      );
    } catch (Exception e) {
      System.out.println(STR.
        "An unexpected error ocurred → \{e.getMessage()}");
    }

  }

}
