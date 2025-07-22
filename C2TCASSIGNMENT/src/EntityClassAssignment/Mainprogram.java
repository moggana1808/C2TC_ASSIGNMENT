package EntityClassAssignment;
import java.util.Scanner;
public class Mainprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
				// TODO Auto-generated method stub

				

		    
		        Scanner scanner = new Scanner(System.in);
		        Student[] students = new Student[3];

		        System.out.println("Enter details for 3 students:");

		        for (int i = 0; i < 3; i++) {
		            System.out.println("Student " + (i + 1) + ":");
		            System.out.print("Enter Roll Number: ");
		            int rollNumber = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            System.out.print("Enter Name: ");
		            String name = scanner.nextLine();

		            System.out.print("Enter Age: ");
		            int age = scanner.nextInt();

		            students[i] = new Student(rollNumber, name, age);
		        }

		        System.out.println("\n--- Student Details ---");
		        for (Student student : students) {
		            student.displayDetails();
		        }

		        scanner.close();
		    }
		}
