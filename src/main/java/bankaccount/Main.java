package bankaccount;

import java.util.Scanner;

/**
 * The Bank Account program simulates a bank account and its fundamental
 * operations, like:
 * <li>Check balance</li>
 * <li>Receive value</li>
 * <li>Transfer value</li>
 * @version 0.1
 */
public class Main {

  private final String name = "DarkLayin";
  private final String accountType = "Checking";
  private Double balance = 2500.0;

  void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println(
      STR."""
      ***********************
      Client's initial data:

      Name: \{name}
      Account's type: \{accountType}
      Initial balance: \{balance}
      ***********************
      """
    );
    do {
      System.out.println(
        """
        Operations
  
        1. Check balance
        2. Receive value
        3. Transfer value
        4. Exit
  
        Please input the desired option:
        """
      );
      switch(scan.nextInt()) {
        case 1 -> System.out.println("Current balance: " + checkBalance());
        case 2 -> {
          System.out.println("Please input the value you will receive:");
          receiveValue(scan.nextDouble());
        }
        case 3 -> {
          System.out.println("Please input the value you will transfer:");
          transferValue(scan.nextDouble());
        }
        case 4 -> {
          return;
        }
      }
    } while (true);
  }

  /**
   * Checks the account's total balance and returns its value
   * @return balance
   */
  private Double checkBalance() {
    return balance;
  }

  /**
   * Receives the specified value and add to the balance
   * @param value the value to be received
   */
  private void receiveValue(Double value) {
    balance += value;
  }

  /**
   * Transfers the specified value if the value does not exceed total
   * balance and subtracts it
   * @param value the value to be transferred
   */
  private void transferValue(Double value) {
    if (balance >= value) balance -= value;
    else System.out.println("You don't have enough balance to do this transaction");
  }

}
