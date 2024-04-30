package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.operations.TimeCalculator;
import br.com.alura.screenmatch.operations.RecommendationFilter;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie meuMovie = new Movie("O poderoso chefão", 1970);
        meuMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + meuMovie.getDurationInMinutes());

        meuMovie.showDatasheet();
        meuMovie.rate(8);
        meuMovie.rate(5);
        meuMovie.rate(10);
        System.out.println("Total de avaliações: " + meuMovie.getRatingsTotal());
        System.out.println(meuMovie.getAverage());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Series lost = new Series("Lost", 2000);
        lost.showDatasheet();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Movie outroMovie = new Movie("Avatar", 2023);
        outroMovie.setDurationInMinutes(200);

        TimeCalculator calculadora = new TimeCalculator();
        calculadora.inclui(meuMovie);
        calculadora.inclui(outroMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTotalTime());

        RecommendationFilter filtro = new RecommendationFilter();
        filtro.filter(meuMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filtro.filter(episode);

        var filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.setDurationInMinutes(200);
        filmeDoPaulo.rate(10);

        ArrayList<Movie> listaDeMovies = new ArrayList<>();
        listaDeMovies.add(filmeDoPaulo);
        listaDeMovies.add(meuMovie);
        listaDeMovies.add(outroMovie);
        System.out.println("Tamanho da lista " + listaDeMovies.size());
        System.out.println("Primeiro filme " + listaDeMovies.get(0).getName());
        System.out.println(listaDeMovies);
        System.out.println("toString do filme " + listaDeMovies.get(0).toString());


    }
}