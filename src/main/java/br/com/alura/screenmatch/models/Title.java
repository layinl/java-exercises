package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exceptions.YearFormatException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
  @SerializedName("Title")
  private String name;
  @SerializedName("Year")
  private int launchYear;
  private boolean planIncluded;
  private double ratingsSum;
  private int ratingsTotal;
  private int durationInMinutes;

  public Title(String name, int launchYear) {
    this.name = name;
    this.launchYear = launchYear;
  }

  public Title(TitleOmdb titleOmdb) {
    this.name = titleOmdb.title();
    if(titleOmdb.year().length() > 4)
      throw new YearFormatException("Wrong year format. It must have up to 4 characters");
    this.launchYear = Integer.parseInt(titleOmdb.year());
    this.durationInMinutes = Integer.parseInt(titleOmdb.runtime().substring(0, 2));
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
  public int compareTo(Title otherTitle) {
    return this.getName().compareTo(otherTitle.getName());
  }

  @Override
  public String toString() {
    return STR.
      """
      {
        name: '\{name}',
        launchYear: '\{launchYear}'
      }
      """;
  }
}
