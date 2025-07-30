package Assignment2;
import java.util.Scanner;

public class Commision {

	    String name;
	    String address;
	    String phone;
	    double salesAmount;
	    double commission;

	    // Method to accept details
	    public void acceptDetails() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Name: ");
	        name = sc.nextLine();
	        System.out.print("Enter Address: ");
	        address = sc.nextLine();
	        System.out.print("Enter Phone: ");
	        phone = sc.nextLine();
	        System.out.print("Enter Sales Amount: ");
	        salesAmount = sc.nextDouble();
	    }

	    // Method to calculate commission
	    public void calculateCommission() {
	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("Commission for " + name + " is: " + commission);
	    }
	
}
