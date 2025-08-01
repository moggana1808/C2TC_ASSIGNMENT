package Assignment5;

public class Bank {
	
		// 1. Static part

		    private static int totalAccounts = 0;

		    public static void incrementAccounts() {
		        totalAccounts++;
		    }

		    public static int getTotalAccounts() {
		        return totalAccounts;
		    }
		}

