package networkaveragespeed;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static int calculateAverageSpeed(String[] speeds) {
    double total = 0;

    for(String speed : speeds) {
      total += Integer.parseInt(speed);
    }

    OptionalDouble optionalAvg = Arrays.stream(speeds).flatMapToInt(speed -> IntStream.of(Integer.parseInt(speed))).average();

    //return (int) total / speeds.length;
    return (optionalAvg.isPresent())? (int) optionalAvg.getAsDouble() : 0;
  }

  void main() {

    Scanner scan = new Scanner(System.in);

    // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
    String input = scan.nextLine();

    // Convertendo a entrada em uma lista de strings
    String[] speeds = input.split(",");

    // Calculando a velocidade média de conexão
    int averageSpeed = calculateAverageSpeed(speeds);

    // Exibindo a velocidade média de conexão
    // System.out.println((int) velocidadeMedia + " Mbps");
    System.out.println(STR."\{averageSpeed} Mbps");

    scan.close();
  }

}
