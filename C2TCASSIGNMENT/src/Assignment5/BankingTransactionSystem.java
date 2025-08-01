package Assignment5;

public class BankingTransactionSystem {
	
		
		// Main class to demonstrate everything

		    public static void main(String[] args) {
		        SavingsAccount savings = new SavingsAccount();
		        CheckingAccount checking = new CheckingAccount();

		        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());

		        Transaction txn = new Transaction();
		        txn.performTransaction(savings, "deposit", 200);
		        txn.performTransaction(checking, "withdraw", 100);

		        savings.displayAccountInfo();
		        checking.displayAccountInfo();

		        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());
		    }
		}

