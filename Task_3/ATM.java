import java.util.Scanner;

// BankAccount class represents the user's bank account
class BankAccount 
{
    private double balance; // Stores the account balance

    // Constructor to initialize the account balance
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    // Method to get the account balance
    public double getBalance() 
    {
        return balance;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) 
    {
        if (amount > balance)
	{
            System.out.println("Insufficient balance!");
            return false;
        } 
	else 
	{
            balance -= amount;
            return true;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
    }
}

// ATM class represents the ATM machine
public class ATM 
{
    private BankAccount account; // Reference to the user's bank account

    // Constructor to connect the ATM with the user's bank account
    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    // Method to display the ATM menu and handle user input
    public void displayMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
	{
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
	   {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }

    // Method to check the account balance
    private void checkBalance() 
    {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    // Method to withdraw money from the account
    private void withdraw(double amount) 
    {
        if (amount <= 0)
	{
            System.out.println("Invalid amount. Please enter a positive number.");
        } 
	else
	{
            if (account.withdraw(amount)) 
	    {
                System.out.println("Successfully withdrawn $" + amount);
                System.out.println("Your new balance is: $" + account.getBalance());
            }
        }
    }

    // Method to deposit money into the account
    private void deposit(double amount) 
    {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            account.deposit(amount);
            System.out.println("Your new balance is: $" + account.getBalance());
        }
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.00); // Initial balance
        ATM atm = new ATM(userAccount); // Create ATM object with user's bank account
        atm.displayMenu(); // Display ATM menu
    }
}
