package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title> {
  private String name;
  private int launchYear;
  private boolean planIncluded;
  private double ratingsSum;
  private int ratingsTotal;
  private int durationInMinutes;

  public Title(String name, int launchYear) {
    this.name = name;
    this.launchYear = launchYear;
  }

  public String getName() {
    return name;
  }

  public int getLaunchYear() {
    return launchYear;
  }

  public boolean isPlanIncluded() {
    return planIncluded;
  }

  public int getDurationInMinutes() {
    return durationInMinutes;
  }

  public int getRatingsTotal() {
    return ratingsTotal;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLaunchYear(int launchYear) {
    this.launchYear = launchYear;
  }

  public void setPlanIncluded(boolean planIncluded) {
    this.planIncluded = planIncluded;
  }

  public void setDurationInMinutes(int durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
  }

  public void showDatasheet(){
    System.out.println("Nome do filme: " + name);
    System.out.println("Ano de lançamento: " + launchYear);
  }

  public void rate(double nota){
    ratingsSum += nota;
    ratingsTotal++;
  }

  public double getAverage(){
    return ratingsSum / ratingsTotal;
  }

  @Override
  public int compareTo(Title outroTitle) {
    return this.getName().compareTo(outroTitle.getName());
  }
}
