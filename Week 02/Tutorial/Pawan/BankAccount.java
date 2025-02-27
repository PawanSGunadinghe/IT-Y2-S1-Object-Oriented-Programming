package week02Tutorial;

public class BankAccount {
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    public BankAccount() {
	        this.accountNumber = "000000";
	        this.accountHolderName = "Unknown";
	        this.balance = 0.0;
	    }

	    public BankAccount(String accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }
	        else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        }
	        else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public void display() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	    }
}
