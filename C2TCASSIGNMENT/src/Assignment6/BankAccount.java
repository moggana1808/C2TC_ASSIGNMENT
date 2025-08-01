package Assignment6;



	public class BankAccount {
		
		// BankAccount class simulates a basic bank account

		    private int accountNumber;
		    private double balance;

		    // Parameterized constructor
		    public BankAccount(int accountNumber, double initialBalance) {
		        this.accountNumber = accountNumber;
		        this.balance = initialBalance;
		    }

		    // Method to deposit money
		    public void deposit(double amount) throws InvalidAmountException {
		        if (amount <= 0) {
		            throw new InvalidAmountException("Deposit amount must be positive!");
		        }
		        balance += amount;
		        System.out.println("Amount deposited: " + amount);
		    }

		    // Method to withdraw money
		    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		        if (amount <= 0) {
		            throw new InvalidAmountException("Withdrawal amount must be positive!");
		        }
		        if (amount > balance) {
		            throw new InsufficientFundsException("Insufficient funds for withdrawal!");
		        }
		        balance -= amount;
		        System.out.println("Amount withdrawn: " + amount);
		    }

		    // Method to display balance
		    public void displayBalance() {
		        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
		    }
		}


