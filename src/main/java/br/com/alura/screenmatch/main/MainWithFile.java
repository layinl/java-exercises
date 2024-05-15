package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exceptions.YearFormatException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import br.com.alura.screenmatch.requests.TitleRequest;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.Scanner;

public class MainWithFile {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type a movie to search and store locally: ");
    var search = scan.nextLine();

    try (FileWriter movies = new FileWriter("movies.json")) {
      String json = TitleRequest.sendRequestByTitle(search);

      Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create();
      TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
      Title myTitle = new Title(myTitleOmdb);
      String titleInJson = gson.toJson(myTitle);

      movies.write(titleInJson);
      System.out.println(titleInJson);
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
