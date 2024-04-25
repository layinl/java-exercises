package bankaccount;

public class Main {

  private String name = "DarkLayin";
  private String accountType = "Checking";
  private Double balance = 2500.0;

  void main() {
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
  }

  private Double checkBalance() {
    return balance;
  }

  private void receiveValue(Double value) {
    balance += value;
  }

  private void tranferValue(Double value) {
    balance -= value;
  }

}
