package Assignment5;

import Assignment5.Abstract.Account;

public class Transaction {
	
		
		// 3. Final part

		    public final double transactionFee = 2.0;

		    public final void performTransaction(CheckingAccount checking, String type, double amount) {
		        System.out.println("--- Performing Transaction ---");
		        if (type.equalsIgnoreCase("deposit")) {
		           
		            checking.balance -= transactionFee;
		            System.out.println("Transaction fee of " + transactionFee + " applied.");
		        } else if (type.equalsIgnoreCase("withdraw")) {
		            checking.withdraw(amount);
		            checking.balance -= transactionFee;
		            System.out.println("Transaction fee of " + transactionFee + " applied.");
		        } else {
		            System.out.println("Invalid transaction type!");
		        }
		        System.out.println("Transaction Completed. Final Balance: " + checking.getBalance());
		    }

			public void performTransaction(SavingsAccount savings, String type, int amount) {
				// TODO Auto-generated method stub
				
			}
		}

