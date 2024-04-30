package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainWithLists {
  public static void main(String[] args) {
    Movie myMovie = new Movie("O poderoso chefão", 1970);
    myMovie.rate(9);
    Movie anotherMovie = new Movie("Avatar", 2023);
    anotherMovie.rate(6);
    var pauloMovie = new Movie("Dogville", 2003);
    pauloMovie.rate(10);
    Series lost = new Series("Lost", 2000);

    Movie f1 = pauloMovie;

    ArrayList<Title> list = new ArrayList<>();
    list.add(pauloMovie);
    list.add(myMovie);
    list.add(anotherMovie);
    list.add(lost);
    for (Title item: list) {
      System.out.println(item.getName());
      if (item instanceof  Movie movie && movie.getRating() > 2) {
        System.out.println("Classificação " + movie.getRating());
      }
    }

    List<String> searchByArtist = new LinkedList<>();
    searchByArtist.add("Adam Sandler");
    searchByArtist.add("Paulo");
    searchByArtist.add("Jacqueline");
    System.out.println(searchByArtist);

    Collections.sort(searchByArtist);
    System.out.println("Depois da ordenação");
    System.out.println(searchByArtist);
    System.out.println("Lista de titulos ordenados");
    Collections.sort(list);
    System.out.println(list);
    list.sort(Comparator.comparing(Title::getLaunchYear));
    System.out.println("Ordenando por ano");
    System.out.println(list);
  }
}
