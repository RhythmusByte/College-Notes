import java.util.Scanner;

class MinBalExp extends Exception {
  MinBalExp(String message) { super(message); }
}

class Account {
  private double balance;

  void deposit(double amount) { balance += amount; }
  void withdraw(double amount) throws MinBalExp {
    if (amount > balance) throw new MinBalExp("Insufficient balance!");
    balance -= amount;
  }
  double getBalance() { return balance; }
}

public class Bank {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account acc = new Account();
    int choice;
    
    do {
      System.out.println("1. View Balance\n2. Deposit\n3. Withdraw\n4. Exit");
      choice = sc.nextInt();
      
      switch(choice) {
        case 1: System.out.println("Balance: " + acc.getBalance()); break;
        case 2: System.out.print("Deposit amount: "); acc.deposit(sc.nextDouble()); break;
        case 3: 
          System.out.print("Withdraw amount: ");
          try {
            acc.withdraw(sc.nextDouble());
            System.out.println("Withdrawal successful.");
          } catch (MinBalExp e) {
            System.out.println(e.getMessage());
          }
          break;
      }
    } while (choice != 4);
  }
}
