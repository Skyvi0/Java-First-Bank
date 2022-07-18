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

//Function for Depositin money
void deposit(int amount) {
  if (amount != 0) {
    balance = balance + amount;
    previousTransaction = amount;
  }

}

//Function for withdrawing money
void withdraw(int amount) {
  if (amount != 0) {
    balance = balance - amount;
    previousTransaction = amount;
  }
}
