package Assignment5;

public class Abstract {
	

	//2. Abstract part

		abstract class Account {
		    protected String accountNumber;
		    protected double balance;

		    public Account(String accountNumber, double initialBalance) {
		        this.accountNumber = accountNumber;
		        this.balance = initialBalance;
		        Bank.incrementAccounts(); // update totalAccounts when creating an account
		    }

		    public abstract void deposit(double amount);
		    public abstract void withdraw(double amount);
		    public abstract double getBalance();

		    // concrete method - common functionality
		    public void displayAccountInfo() {
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Current Balance: " + balance);
		    }
		}

		class SavingsAccount extends Account {
		    private double interestRate = 0.03; // 3% interest for example

		    public SavingsAccount(String accountNumber, double initialBalance) {
		        super(accountNumber, initialBalance);
		    }

		    @Override
		    public void deposit(double amount) {
		        balance += amount + (amount * interestRate);
		        System.out.println("Deposited " + amount + " with interest. New Balance: " + balance);
		    }

		    @Override
		    public void withdraw(double amount) {
		        if (balance >= amount) {
		            balance -= amount;
		            System.out.println("Withdrew " + amount + ". New Balance: " + balance);
		        } else {
		            System.out.println("Insufficient funds!");
		        }
		    }

		    @Override
		    public double getBalance() {
		        return balance;
		    }
		}

		class CheckingAccount extends Account {
		    private double overdraftLimit = 500.0;

		    public CheckingAccount(String accountNumber, double initialBalance) {
		        super(accountNumber, initialBalance);
		    }

		    @Override
		    public void deposit(double amount) {
		        balance += amount;
		        System.out.println("Deposited " + amount + ". New Balance: " + balance);
		    }

		    @Override
		    public void withdraw(double amount) {
		        if (balance + overdraftLimit >= amount) {
		            balance -= amount;
		            System.out.println("Withdrew " + amount + ". New Balance: " + balance);
		        } else {
		            System.out.println("Overdraft limit exceeded!");
		        }
		    }

		    @Override
		    public double getBalance() {
		        return balance;
		    }

	}
}
