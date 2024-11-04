package hiredserviceverification;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  void main() {
    Scanner scan = new Scanner(System.in);

    String service = scan.nextLine().trim();      // one plan

    String clientInput = scan.nextLine().trim();  // name,planA,planB,planC,...

    String[] parts = clientInput.split(",");
    String clientName = parts[0];

    // TODO: Check if the specified service is on the hired services list
    boolean isHired = Arrays.stream(parts).anyMatch(s -> s.equalsIgnoreCase(service));

    System.out.println((isHired)? "Sim": "Nao");

    scan.close();
  }

}
