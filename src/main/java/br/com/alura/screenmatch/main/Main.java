package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.operations.TimeCalculator;
import br.com.alura.screenmatch.operations.RecommendationFilter;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.showDatasheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total de avaliações: " + myMovie.getRatingsTotal());
        System.out.println(myMovie.getAverage());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Series lost = new Series("Lost", 2000);
        lost.showDatasheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(anotherMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.filter(episode);

        var pauloMovie = new Movie("Dogville", 2003);
        pauloMovie.setDurationInMinutes(200);
        pauloMovie.rate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(pauloMovie);
        movieList.add(myMovie);
        movieList.add(anotherMovie);
        System.out.println("Tamanho da lista " + movieList.size());
        System.out.println("Primeiro filme " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString do filme " + movieList.get(0).toString());


    }
}