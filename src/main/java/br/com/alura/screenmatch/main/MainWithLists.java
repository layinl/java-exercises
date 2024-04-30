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
        Movie meuMovie = new Movie("O poderoso chefão", 1970);
        meuMovie.rate(9);
        Movie outroMovie = new Movie("Avatar", 2023);
        outroMovie.rate(6);
        var filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.rate(10);
        Series lost = new Series("Lost", 2000);

        Movie f1 = filmeDoPaulo;

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuMovie);
        lista.add(outroMovie);
        lista.add(lost);
        for (Title item: lista) {
            System.out.println(item.getName());
            if (item instanceof  Movie movie && movie.getRating() > 2) {
                System.out.println("Classificação " + movie.getRating());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getLaunchYear));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
