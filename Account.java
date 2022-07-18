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

void calculateInterest(int years) {
  double interestRate = balance * 0.05;
  double newBalance = (balance * interestRate * years) + balance;
  System.out.println("The interest rate is " + (100 * interestRate) + "%");
  System.out.println("After " + years + " years, the balance is $" + newBalance);
}
