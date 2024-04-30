package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.operations.Classifiable;

public class Movie extends Title implements Classifiable {
  private String director;

  public Movie(String name, int launchYear) {
    super(name, launchYear);
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  @Override
  public int getRating() {
    return (int) getAverage() / 2;
  }

  @Override
  public String toString() {
    return "Filme: " + this.getName() + " (" + this.getLaunchYear() + ")";
  }
}
