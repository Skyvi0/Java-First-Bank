import java.util.Scanner;

public class Account {
  // Class variables
  int balance;
  int previousTransaction;
  String customerName;
  String customerID;


//Class constructor
Account(String cname, String cid) {
  customerName = cname;
  customerID = cid;
}

void deposit(int amount) {
  if (amount != 0) {
    balance = balance + amount;
    previousTransaction = amount;
  }

}

//function to withdraw money from account
void withdraw(int amount) {
  if (amount != 0) {
    balance = balance - amount;
    previousTransaction = -amount;
  }
}

//function showing previous transaction
void getPreviousTransaction() {
  if (previousTransaction > 0) {
    System.out.println("Deposited $" + previousTransaction);
  } else if (previousTransaction < 0) {
    System.out.println("Withdrew $" + Math.abs(previousTransaction));
  } else {
    System.out.println("No transaction was made.");
  }
}

//function showing interest rate after numbers of years
void calculateInterest(int years) {
  double interestRate = balance * 0.05;
  double newBalance = (balance * interestRate * years) + balance;
  System.out.println("The interest rate is " + (100 * interestRate) + "%");
  System.out.println("After " + years + " years, the balance is $" + newBalance);
}

//function showing main menu
void showMenu(){
  char option = '\0';
  //scanner potential leak
  Scanner scanner = new Scanner(System.in);
  System.out.println("Welcome to the bank of First" + customerName);
  System.out.println("Your account number is " + customerID);
  System.out.println();
  System.out.println("What would you like to do?");
  System.out.println();
  System.out.println("1. Check balance");
  System.out.println("2. Deposit money");
  System.out.println("3. Withdraw money");
  System.out.println("4. Show previous transaction");
  System.out.println("5. Calculate interest");
  System.out.println("6. Exit");

do {
    System.out.println();
    System.out.print("Enter your option: ");
    char option1 = scanner.next().charAt(0);
    option = Character.toUpperCase(option1);
    System.out.println();

    switch (option) {
      case '1':
        System.out.println("Your balance is $" + balance);
        break;
      case '2':
        System.out.print("Enter an amount to deposit: ");
        int amount = scanner.nextInt();
        deposit(amount);
        break;
      case '3':
        System.out.print("Enter an amount to withdraw: ");
        int amount1 = scanner.nextInt();
        withdraw(amount1);
        break;
      case '4':
        getPreviousTransaction();
        break;
      case '5':
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        calculateInterest(years);
        break;
      case '6':
        System.out.println("Thank you for using the bank of First!");
        break;
      default:
        System.out.println("Invalid option. Please try again.");
        break;
      }
    } while (option != '6');
    System.out.println("Thank you for for choosing us!");
  }
}
//end of class Account
