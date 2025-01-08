package task3;

public class ATM_Interface {
	
//	 ATM INTERFACE
//	 1. Create a class to represent the ATM machine.
//	 2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
//	 checking the balance.
//	 3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
//	 checkBalance().
//	 4. Create a class to represent the user's bank account, which stores the account balance.
//	 5. Connect the ATM class with the user's bank account class to access and modify the account
//	 balance.
//	 6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
//	 7. Display appropriate messages to the user based on their chosen options and the success or failure
//	 of their transactions.
	
	public static void main(String[] args) {

        BankAccount account = new BankAccount(1000); // Creating an account with an initial balance
        ATM atm = new ATM(account); // Linking the ATM with the account

        atm.displayMenu(); // Displaying the ATM menu
		
	}

}
