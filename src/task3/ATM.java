package task3;

import java.util.Scanner;

//Class representing the ATM interface
class ATM {
 private BankAccount account;

 public ATM(BankAccount account) {
     this.account = account;
 }

 // Method to display the menu options
 public void displayMenu() {
     Scanner scanner = new Scanner(System.in);
     int choice;
     
     while (true) {
         System.out.println("\nATM Menu:");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 checkBalance();
                 break;
             case 2:
                 depositMoney(scanner);
                 break;
             case 3:
                 withdrawMoney(scanner);
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 scanner.close();
                 return; // Exit the program
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }

 // Method to check balance
 private void checkBalance() {
     System.out.println("Current Balance: $" + account.getBalance());
 }

 // Method to deposit money
 private void depositMoney(Scanner scanner) {
     System.out.print("Enter amount to deposit: $");
     double amount = scanner.nextDouble();
     account.deposit(amount);
     System.out.println("deposit money successfully. New balance: $" + account.getBalance());
 }

 // Method to withdraw money
 private void withdrawMoney(Scanner scanner) {
     System.out.print("Enter amount to withdraw: $");
     double amount = scanner.nextDouble();
     if (!account.withdraw(amount)) {
         System.out.println("Withdrawal failed due to insufficient balance.");
     } else {
         System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
     }
 }
}
