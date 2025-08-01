package Assignment6;



	public class BankingSystemDemo {
		
		// Main class to demonstrate exception handling
		
		    public static void main(String[] args) {
		        BankAccount account = new BankAccount(1001, 5000); // account number 1001, initial balance 5000
		        
		        // Deposit Operation
		        try {
		            account.deposit(2000);   // Valid deposit
		            account.deposit(-100);   // Invalid deposit, triggers InvalidAmountException
		        } catch (InvalidAmountException e) {
		            System.out.println("Deposit Error: " + e.getMessage());
		        } finally {
		            account.displayBalance();
		        }

		        // Withdrawal Operation
		        try {
		            account.withdraw(1000);  // Valid withdrawal
		            account.withdraw(7000);  // Insufficient funds, triggers InsufficientFundsException
		        } catch (InvalidAmountException | InsufficientFundsException e) {
		            System.out.println("Withdrawal Error: " + e.getMessage());
		        } finally {
		            account.displayBalance();
		        }
		    }
		}
		
		

