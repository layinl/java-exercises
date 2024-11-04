package combocontractverification;

import java.util.Scanner;

public class Main {

  public static String checkCompleteCombo(String[] hiredServices) {
    boolean isMobileHired = false;
    boolean isBroadbandHired = false;
    boolean isTVHired = false;

    for (String service : hiredServices) {
      switch (service.toLowerCase()) {
        case "movel" -> isMobileHired = true;
        case "banda larga" -> isBroadbandHired = true;
        case "tv" -> isTVHired = true;
      }
    }

    if (isMobileHired && isBroadbandHired && isTVHired)
      return "Combo Completo";
    return "Combo Incompleto";
  }

  void main() {
    Scanner scan = new Scanner(System.in);

    // Solicitando ao usuário a lista de serviços contratados
    // e convertendo a entrada em uma lista de strings
    String[] hiredServices = scan.nextLine().split(",");

    // Verificando se o cliente contratou um combo completo e exibindo o resultado
    System.out.println(checkCompleteCombo(hiredServices));

    // Fechando o scanner
    scan.close();
  }

}