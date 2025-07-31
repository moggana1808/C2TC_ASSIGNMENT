package Assignment4;


	import java.util.Scanner;

	class TicketBooking {
	    private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    // Default constructor
	    public TicketBooking() {}

	    // Parameterized constructor
	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // Getters and setters
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    public String getCustomer() {
	        return customer;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    public Integer getNoOfSeats() {
	        return noOfSeats;
	    }

	    public void setNoOfSeats(Integer noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    // Overloaded methods for payment

	    // Cash payment
	    public void makePayment(int amount) {
	        System.out.printf("Amount %.1f paid in cash\n", (double) amount);
	    }

	    // Wallet payment
	    public void makePayment(int amount, String walletNumber) {
	        System.out.printf("Amount %.1f paid using wallet number %s\n", (double) amount, walletNumber);
	    }

	    // Credit card payment
	    public void makePayment(String holderName, int amount, String creditCardType, String ccv) {
	        System.out.println("Holder name:" + holderName);
	        System.out.printf("Amount %.1f paid using %s card\n", (double) amount, creditCardType);
	        System.out.println("CCV:" + ccv);
	    }
	}

	