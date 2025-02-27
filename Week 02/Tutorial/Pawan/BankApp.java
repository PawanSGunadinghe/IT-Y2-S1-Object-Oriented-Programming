package week02Tutorial;

public class BankApp {
	 public static void main(String[] args) {

	        BankAccount account1 = new BankAccount("123456", "Alice", 1000.0);
	        BankAccount account2 = new BankAccount("789012", "Bob", 500.0);

	        System.out.println("Account 1 Details:");
	        account1.display();
	        
	        System.out.println("\nAccount 2 Details:");
	        account2.display();
	    }
}
