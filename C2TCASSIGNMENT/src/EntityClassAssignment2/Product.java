package EntityClassAssignment2;

public class Product {
		    private int productId;
		    private String productName;
		    private double productPrice;

		    // Constructor
		    public Product(int productId, String productName, double productPrice) {
		        this.productId = productId;
		        this.productName = productName;
		        this.productPrice = productPrice;
		    }

		    // Display product details
		    public void displayDetails() {
		        System.out.println("Product ID   : " + productId);
		        System.out.println("Product Name : " + productName);
		        System.out.println("Price        : ₹" + productPrice);
		        System.out.println("-----------------------------");
		    }
		

	}


