package task3;

import java.util.Scanner;

//Class representing a bank account
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     if (initialBalance > 0) {
         this.balance = initialBalance;
     } else {
         this.balance = 0;
         System.out.println("Initial balance must be positive.");
     }
 }

 // Method to withdraw money
 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         return true;
     } else {
         System.out.println("Insufficient balance.");
         return false;
     }
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposit successful.");
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to check balance
 public double getBalance() {
     return balance;
 }
}
