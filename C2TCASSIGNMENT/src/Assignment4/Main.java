package Assignment4;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while(sc.hasNextLine()) {
	            String bookingDetails = sc.nextLine();
	            if (bookingDetails == null || bookingDetails.trim().isEmpty()) {
	                break; // Stop if empty input
	            }
	            String[] parts = bookingDetails.split(",");
	            String stageEvent = parts[0];
	            String customer = parts[1];
	            Integer noOfSeats = Integer.parseInt(parts[2]);

	            TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

	            int paymentMode = Integer.parseInt(sc.nextLine());

	            // Print booking details
	            System.out.println("Stage event:" + tb.getStageEvent());
	            System.out.println("Customer:" + tb.getCustomer());
	            System.out.println("Number of seats:" + tb.getNoOfSeats());

	            if(paymentMode == 1) {
	                int amount = Integer.parseInt(sc.nextLine());
	                tb.makePayment(amount);
	            } else if(paymentMode == 2) {
	                int amount = Integer.parseInt(sc.nextLine());
	                String walletNumber = sc.nextLine();
	                tb.makePayment(amount, walletNumber);
	            } else if(paymentMode == 3) {
	                String holderName = sc.nextLine();
	                int amount = Integer.parseInt(sc.nextLine());
	                String creditCardType = sc.nextLine();
	                String ccv = sc.nextLine();
	                tb.makePayment(holderName, amount, creditCardType, ccv);
	            } else {
	                System.out.println("Invalid choice");
	            }
	        }

	        sc.close();
	    }
	}

