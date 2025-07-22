package EntityClassAssignment2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	

		        Scanner scanner = new Scanner(System.in);
		        Product[] products = new Product[4];

		        System.out.println("Enter details for 4 products:");

		        for (int i = 0; i < 4; i++) {
		            System.out.println("\nProduct " + (i + 1) + ":");
		            System.out.print("Enter Product ID: ");
		            int id = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            System.out.print("Enter Product Name: ");
		            String name = scanner.nextLine();

		            System.out.print("Enter Product Price: ₹");
		            double price = scanner.nextDouble();

		            products[i] = new Product(id, name, price);
		        }

		        System.out.println("\n--- Product Details ---");
		        for (Product product : products) {
		            product.displayDetails();
		        }

		        scanner.close();
		    }
		

	}


